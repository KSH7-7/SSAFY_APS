import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();  // 테스트 케이스 수 입력

        for (int test_case = 1; test_case <= TC; test_case++) {
            int N = sc.nextInt();  // 학생 수
            int min = sc.nextInt();  // 분반 최소 학생수
            int max = sc.nextInt();  // 분반 최대 학생수
            
            int[] scores = new int[N];  // 학생 점수 배열
            
            for (int i = 0; i < N; i++) {
                scores[i] = sc.nextInt();  // 학생 점수 입력
            }
            
            int result = Integer.MAX_VALUE;  // 차이의 최소값을 저장할 변수
            boolean found = false;  			// 분할이 옳은가?

            for (int sc1 = 1; sc1 < 100; sc1++) {
                for (int sc2 = sc1 + 1; sc2 <= 100; sc2++) {
                   
					int high = 0;
                    int mid = 0; 
                    int low = 0;

                    for (int i = 0; i < N; i++) {			// 학생들을 분반으로 나누기
                        if (scores[i] >= sc2) {
                            high++;
                        } else if (scores[i] >= sc1) {
                            mid++;
                        } else {
                            low++;
                        }
                    }

                    if (high >= min && high <= max && mid >= min && mid <= max && low >= min && low <= max) {			// 범위 내의 인원 수를 가지는지 체크
                        found = true;  																																// 정상 분할

                        int maxGrp = Math.max(high, Math.max(mid, low));																			   // 두 그룹을 먼저 비교하고 나머지 하나와 함께 최대 파악
                        int minGrp = Math.min(high, Math.min(mid, low));																				// 두 그룹을 먼저 비교하고 나머지 하나와 함께 최소 파악

                        result = Math.min(result, maxGrp - minGrp);  // 최소 차이 갱신
                    }
                }
            }

            if (found) {
                System.out.println("#" + test_case + " " + result);
            } else {
                System.out.println("#" + test_case + " -1");
            }
        }
        sc.close();
    }
}

// 다음부터 int result = Integer.MAX_VALUE; 적극 활용하기...
// also Math.max