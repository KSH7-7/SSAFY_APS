package SWEA_1208_flatten;

import java.util.Scanner;
import java.util.Arrays;


class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T = 10;														// 테스트 케이스
		int size = 100;													// 케이스 당 규모
        int [] box = new int[size];										// 박스 초기화
        int [] ans = new int[size];										// 최종 배열 초기화
        
		for(int test_case = 1; test_case <= 10; test_case++)
		{        

			int dump = sc.nextInt();									//덤프 횟수
			for (int i = 0; i < box.length; i++) {			
                box[ i ] = sc.nextInt();
            }															//박스 입력
			ans = sort(box);											// 정렬된 박스(덤프X)

		for( int i = 0; i < dump; i++) {								// 양극단 덤프 로직
			ans = sort(ans);
			if(ans[99] - ans[0] <= 1)
				break;
			ans[99]--; ans[0]++;
			}
		sort(ans);														// 다음 테스트를 위한 초기화
		
		System.out.println("#" + test_case + " " + (ans[99] - ans[0]));	// 정답 출력
		}
	}
	
	static int[] sort(int[] box) {								// 카운팅 정렬 메서드
		int[] ans = new int[100];								//
		
		int [] counting = new int[101];
		//누적합 구하기
        for  (int i = 0; i < box.length; i++) {
        	counting[ box[ i ] ]++;
        }
        
        for (int i = 1; i < counting.length; i++) {
		counting[ i ] += counting[ i - 1 ];
		}
        

        for ( int i = box.length - 1; i >= 0; i--) {
		int val = box[ i ];
		counting[val]--;
		ans[counting[val]] = val;
//		System.out.println(counting[val]);
		}
		
        return ans;
	}
}
