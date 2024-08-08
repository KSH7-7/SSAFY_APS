package SWEA_1860_진기의최고급붕어빵;

import java.util.Queue;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.LinkedList;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();														// 손님의 수
            int M = sc.nextInt();													    // 붕어빵 완성 전까지 소요시간
            int K = sc.nextInt();														// 완성할 경우 만들어지는 재고의 수
            int t = 0;																    // 초기 영업시간
            int totarr;																	// 손님들 전부 올때까지 걸리는 시간
            int [ ] wait = new int [ totarr ];											// 손님 대기열(도착시간의 합 사이즈)
            for (int j = 0; j < N ; j++) {
                int arrive = sc.nextInt();
            	totarr += arrive;														// 손님들 도착 시간 합산
                wait[arrive] = 1;														// 손님들 도착하면 해당 시간은 1이 됨
            }
                  
                Queue queue = new Queue();												// 붕어빵 대기열
            while ( t >= T ) {															// 영업시간이 손님 도착시간의 합보다 클 때까지 반복
            for ( int i = 1; i <= M+K; i++) {
                	if ( i <= M) {
						queue.offer(0);													// 붕어빵이 완성 전이므로 대기열에 매초 0 추가
                        t += 1;															// 영업시간 1초 진행
					} else {
						queue.offer(1);													// 붕어빵 완성되었으므로 완성된만큼(K개) 매초 1 추가
                        t += 1;															// 영업시간 1초 진행
					}
            }
            }
            for (int i = 0; i < T; i++) {
                if ( 1 == wait [i]) {													// 손님이 도착했을 때
                    if ( wait[i] == queue.poll() ) {										// 손님이 도착했을 때 대기열에 붕어빵이 있는지 체크
                        System.out.println("#" + test_case + " " + "Possible");			// 있다면 Possible 출력
                    } else {
                    System.out.println("#" + test_case + " " + "Impossible");     		// 없다면 Impossible 출력
                    }
                }
            }
                sc.close();
		}
	}
}