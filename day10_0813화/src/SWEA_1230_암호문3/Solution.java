package SWEA_1230_암호문3;

import java.util.Scanner;
import java.util.LinkedList;

public class Solution {

	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = 10;
		LinkedList list = new LinkedList();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
		int N = sc.nextInt();						// 암호문의 개수
		for (int i = 0; i < N; i++) {
			int Ns = sc.nextInt();					// 암호문 뭉치 입력		
		}
		int M = sc.nextInt();						// 명령어의 개수
		
		for (int j = 0; j < M; j++) {
			String command = sc.next();				// 명령어 입력
			
			switch (command) {
			case "I" :								// 커맨드가 I 입력되었을 때
				int x = sc.nextInt();
				int y = sc.nextInt();
				for(int k = 0; k <y; k++ ) {
					list.addData(x+k+1, s);			// x번째 암호문부터 y개 사이즈의 입력s를 삽입
				}
					
			case "D" :
				int x = sc.nextInt();
				int y = sc.nextInt();
				for(int k = 0; k <y; k++ ) {
					list.remove(x+k+1);			// x번째 암호문부터 y개 삭제
				}
				
				
			case "A" :
				int y = sc.nextInt();
				int s = sc.nextInt();
				for(int k = 0; k <y; k++ ) {
					list.add(list.size()-1, s);			// 맨 뒤에 넣기
				}
				
			}
			
			
			
			
			
			
			
//			if (command == "I") {					// 커맨드가 I 입력되었을 때
//				int x = sc.nextInt();
//				int y = sc.nextInt();
//				for(int k = 0; k <y; k++ ) {
//					list.addData(x+k+1, s);			// x번째 암호문부터 y개 사이즈의 입력s를 삽입
//				}
//				
//			}
//			if (command == "D") {					// 커맨드가 D 입력되었을 때
//				int x = sc.nextInt();
//				int y = sc.nextInt();
//				for(int k = 0; k <y; k++ ) {
//					list.removeData(x+k+1);			// x번째 암호문부터 y개 삭제
//				}
//			}
//			
//			if (command == "A") {					// 커맨드가 A 입력되었을 대
//				int y = sc.nextInt();
//				int s = sc.nextInt();
//				for(int k = 0; k <y; k++ ) {
//					list.addData(list.size()-1, s);			// 맨 뒤에 넣기
//				}
//			}
		}
		int C = sc.nextInt();


		}
	}
	
}