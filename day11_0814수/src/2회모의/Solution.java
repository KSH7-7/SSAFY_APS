import java.util.Arrays;
import java.util.LinkedList;
//import java.util.Queue;
import java.util.Scanner;
//import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Queue<Character> qoo = new LinkedList<>();
//		Stack<String> ST = new Stack<>();
		
		// 아이디어: 연속된 문자 3개를 가지는 모든 수를 생성 -> size()=N-K+1이 될때까지 비교하며 제거?
		int T = sc.nextInt();										// 테스트 케이스 입력
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();									// 문자열 길이 N 입력
			char[] cd = new char [N];								
			int K = sc.nextInt();									// 순서 K 입력
			char[] arr = new char [N+2];
 			String wd = sc.next();									// 비밀번호 입력
			for (int i = 0; i < N; i++) {
				cd[i] = wd.charAt(i);
//				ST.push(wd);
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = i; j < i+3; j++) {
					arr[j] += cd[j];
					
					if ( j == N - 2) {
						arr[N+1] = cd[1];
						}
					else if ( j == N - 1) {
						cd[N] = cd[1];
						cd[N+1] = cd[2];
						}
					}
				}
			
			
			for (int k = 0; k < N; k++) {
				
			}			

			
			System.out.println(&quot;#&quot; + test_case + &quot; &quot; + &quot;ans&quot;);

	}

	}
}