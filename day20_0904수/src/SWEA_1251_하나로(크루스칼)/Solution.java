package SWEA_1251_하나로(크루스칼);

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    static class Edge implements Comparable<Edge> {
        int A, B;               // 두 정점
        double W;               // x,y범위가 비정상적으로 크므로 간선 가중치는 일단 실수에 배정
    
        public Edge(int a, int b, double w) {
            super();
            A = a;
            B = b;
            W = w;
        }
        
        @Override
        public String toString() {
            return "Edge [A=" + A + ", B=" + B + ", W=" + W + "]";
        }
    
        @Override
        public int compareTo(Edge o) {
            return Double.compare(this.W, o.W);     // 간선 가중치 비교
        }
    }

    static int[] p;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 수
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();           // 섬의 개수
            int[][] yx = new int [N][2];    // 섬의 좌표 배열

            for (int i = 0; i < N; i++) {
                yx[i][0] = sc.nextInt();  // x 좌표 입력
            }
            for (int i = 0; i < N; i++) {
                yx[i][1] = sc.nextInt();  // y 좌표 입력
            }

            double E = sc.nextDouble();   // 환경 부담 세율 E

            // 입력 끝, 크루스칼각 시작
            int EE = N*(N-1)/2;           // 일단 모든 정점을 잇고본다
            Edge[] edges = new Edge[EE];    // 간선 만든다
             // int[][] edges2 = new int[E][3]; // [0] : 시작, [1] : 도착, [2] : 가중치
            int index = 0;                  // 간선 인덱스 초기화
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    // dist라 썼지만 결국 길이를 다시 제곱해야하므로 사실상 dist=거리제곱
                    double dist = Math.pow(yx[i][0] - yx[j][0], 2) + Math.pow(yx[i][1] - yx[j][1], 2);
                    edges[index++] = new Edge(i, j, dist);
                }
            }

            Arrays.sort(edges);     // 간선 가중치대로 정렬

            p = new int[N];         // p 배열 초기화
            for (int i = 0; i < N; i++) {
                p[i] = i;
            }

            double sum = 0;                  // 비용 초기화
            int cnt = 0;                     // 간선 카운트 초기화

            for (Edge edge : edges) {           // 크루스칼 알고리즘
                if (findSet(edge.A) != findSet(edge.B)) {
                    union(edge.A, edge.B);    // 두 정점을 하나로
                    sum += edge.W;            // 비용에 가중치를 -
                    cnt++;                    // 카운트 증가
                    if (cnt == N - 1) break;  // N-1개의 간선을 선택하면 종료
                }
            }

            long rsum = Math.round(sum * E);    // 환경 부담 세율을 곱해 최종 비용 계산

            System.out.println("#" + tc + " " + rsum);  // 소수점 첫째자리에서 반올림하여 출력
        }

        sc.close();
    }

    static void makeSet(int x) {
		p[x] = x;                   // makeSet 함수
	}

    public static int findSet(int x) {
        if (x != p[x]) 
            p[x] = findSet(p[x]);   // findSet 함수
        return p[x];
    }

    public static void union(int x, int y) {
        p[findSet(y)] = findSet(x); // union 함수
    }

}



// 아래는 설계 중 기본 뼈대 ( 폐기하려 했으나 아까워서 )
// import java.util.Arrays;
// import java.util.Comparator;
// import java.util.Scanner;

// public class Solution {
    
//     static class Edge implements  Comparable<Edge> {
//         int A, B, W;

//         public Edge(int a, int b, int w) {
//             super();
//             A = a;
//             B = b;
//             W = w;
//         }

// 		@Override
// 		public String toString() {
// 			return "Edge [A=" + A + ", B=" + B + ", W=" + W + "]";
// 		}
		
// 		@Override
// 		public int compareTo(Edge o) {
// 			return this.W - o.W;
// 		}
        
//     }
//     static int[] p;

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();

//         for(int tc = 1; tc <= T; tc++) {
//             int N = sc.nextInt();
//             int [][] indo = new int [N][N];
//             for (int y = 0; y < N; y++) {
//                 for (int x = 0; x < N; x++) {
//                     indo[x][y] = sc.nextInt();  
//                 }
//             }
//             double E = sc.nextInt();
//             int V = N;
//             int EE = N*(N-1)/2;

//             Edge[] edges = new Edge[EE];
//             int[][] edges2 = new int[EE][3];
            
//             Arrays.sort(edges2, new Comparator<int[]>() {
//             	@Override
//             	public int compare(int[] o1, int[] o2) {
//             		return o1[2] - o2[2];
//             	}
// 			});

//             for (int i = 0; i < EE; i++) {
//             	edges[i] = new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt());
//             }
   
//             Arrays.sort(edges);
            
//             p = new int[V];
            
//             for(int i = 0; i < V; i ++) {
//             	makeSet(i);
//             }
            
//             int ans = 0;
//             int pick = 0;
            
//             for(int i = 0; i < EE; i ++) {
//             	int px = findSet(edges[i].A);
//             	int py = findSet(edges[i].B);
            	
//             	if (px != py) {
//             		union(px, py);
//             		ans += edges[i].W;
//             		pick++;
//             	}
            	
//             	if (pick == (V-1))
//             		break;
//             }
            
//             int sum = (int) (E * Math.pow(ans, 2)+0.5);
//             System.out.println("#" + tc + " " + sum);
//         }
//         sc.close();
//     }
    
//     static int makeSet(int x) {
//         return p[x] = x;
//     }

//     static int findSet(int x) {
//         if ( x != p[x])
//         	p[x] = findSet(p[x]);
//         return p[x];
//     }

//     static void union(int x, int y) {
//     	p[y] = x;
//     }
    
// }