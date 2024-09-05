package SWEA_1251_하나로(프림);

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Solution {

    static class Edge implements Comparable<Edge> {
        int A, B;       // 연결된 정점
        double W;       // 간선의 가중치

        public Edge(int a,int b, double w) {
            this.A = a;
            this.B = b;
            this.W = w;
        }

        @Override
        public int compareTo(Edge o) {
            return Double.compare(this.W, o.W);
        }
    }

    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 수

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();  // 섬의 개수
            int[][] yx = new int[N][2];  // 섬의 좌표 배열

            for (int i = 0; i < N; i++) {
                yx[i][0] = sc.nextInt();    // x좌표 입력
            }

            for (int i = 0; i < N; i++) {
                yx[i][1] = sc.nextInt();    // y좌표 입력
            }

            double E = sc.nextDouble();  // 환경 부담 세율 E

            List<Edge>[] adjList = new ArrayList[N];
            for (int i = 0; i < N; i++) {
                adjList[i] = new ArrayList<>();         // 인접리스트
            }

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    double dist = Math.pow(yx[i][0] - yx[j][0], 2) + Math.pow(yx[i][1] - yx[j][1], 2);
                    adjList[i].add(new Edge(i, j, dist));
                    adjList[j].add(new Edge(j, i, dist));          // 섬의 거리에 대해서 인접리스트 추가
                }
            }

            boolean[] visited = new boolean[N];  // 방문 했냐 안했냐 저장
            
            PriorityQueue<Edge> pq = new PriorityQueue<>();  // 가중치 낮은 간선 고르기 위함
            visited[0] = true;      // 정점 선택 완료

            pq.addAll(adjList[0]);  // 모두다 우순큐에 넣는다

            double sum = 0;  // 총 비용
            int pick = 1;    // 선택된 간선 수

            while (pick != N) {
                Edge e = pq.poll();  // 우선순위 큐에서 가장 가중치가 작은 간선 선택
                if (visited[e.B]) continue;  // 이미 방문한 정점이면 스킵

                sum += e.W;  // 비용 추가
                visited[e.B] = true;  // 방문 처리
                pick++;  // 선택된 정점 수 증가
                pq.addAll(adjList[e.B]);    // 선택된 정점과 연결된 모든 간선을 우선순위 큐에 삽입
            }

            long result = Math.round(sum * E);      // 마찬가지로 반올림하여 출력
            System.out.println("#" + tc + " " + result);
        }

        sc.close();
    }
}
