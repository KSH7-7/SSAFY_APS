package SWEA_1860_진기의최고급붕어빵;

import java.util.Scanner;
import java.util.Arrays;
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
            int [] wait = new int [N];											        // 손님 대기열(도착시간의 합 사이즈)
            for (int i = 0; i < N ; i++) {
                wait[i] = sc.nextInt();
            }
            Arrays.sort(wait);                                                          // 손님 대기열 정렬
            Queue queue = new Queue(N*M*K);											// 붕어빵 대기열을 위한 Queue
            int t = 0;                                                                  // 영업시간 초기화
            boolean Possible = true;                                                    // Impo.가 기준이면 바로 끝날 수 있으므로 이걸 true로

            for ( int i = 0; i < N; i++) {
                int guesttime = wait[i];                                                // 손님타임 가시화
                
                while ( t < guesttime) {                                                     // 영업시간이 손님 대기시간보다 아직 적을 떄
                    t++;                                                                // 그냥 시간이 흘러감
                	if ( t % M == 0) {
                        for (int j = 0; j < K; j++) {
                            queue.offer(1);                                             // 시간이 흘러 붕어빵 완성시 +1
                        }
                    }
                }
                if (queue.isEmpty()) {
                    Possible = false;                                                   // 붕어빵 못주면 게임오버
                    break;
                } else {
                    queue.poll();                                                       // 붕어빵 하나 판매
                }
            }
            
            if (Possible) {
                System.out.println("#" + test_case + " " + "Possible");                       // 판매 가능
            }   else {
                System.out.println("#" + test_case + " " + "Impossible");                     // 불가능
            }
        }
                sc.close();
		}
	}
        // SWEA에서는 일부 결과 출력을 포함한 런타임 에러... 
        // 스택 라이브러리 등을 이용한 간편한 방식을 쓰면
        // 샘플과 전혀 다른 출력임(PIPI.. vs IPPI..)에도 런타임 에러 없는 pass... 웹 컴파일러 문제?
        // 원인을 몰라 미침..;; 추후 분석 요망 to 미래의 나

    class Queue {
        private int[] index;                                            // Queue에 대한 배열
        private int front;                                              // Queue의 앞
        private int rear;                                               // Queue의 뒤
        private int size;                                               // Queue의 사이즈
        private int max;                                                // Queue의 최대 사이즈
    
        public Queue(int max) {                                         // 생성자 초기화
            this.max = max;
            this.index = new int[max];                                  // 최대치
            this.front = 0;                                             // 원형 배열로 접근한다면..
            this.rear = -1;                                             // 당연히
            this.size = 0;                                              // 초기화
        }
    
        public void offer(int value) {                                  // offer()에 대한 전개
            if (size == max) {                                          // 초과일 때 예외처리
                throw new IllegalStateException("Queue is full");
            }
            rear = (rear + 1) % max;                                    // 원형 배열 세팅
            index[rear] = value;                                        // rear에 값 배치
            size++;
        }
    
        public int poll() {                                             // poll()에 대한 전개
            if (isEmpty()) {                                            // 부족일 때 예외처리
                throw new IllegalStateException("Queue is empty");
            }
            int value = index[front];                                   // 가장 앞의 것을!
            front = (front + 1) % max;                                  // 마찬가지로 원형 배열
            size--;                                                     // 삭제하고
            return value;                                               // 반환
        }
    
        public boolean isEmpty() {
            return size == 0;                                           // Queue가 비어있다면 사이즈는 0
        }
    }