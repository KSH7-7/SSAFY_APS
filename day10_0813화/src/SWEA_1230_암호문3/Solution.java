package SWEA_1230_암호문3;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = 1;
		LinkedList list = new LinkedList();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
		int N = sc.nextInt();						// 암호문의 개수
		for (int i = 0; i < N; i++) {
			int Ns = sc.nextInt();					// 암호문 뭉치 입력		
			list.add(Ns);
		}
		int M = sc.nextInt();						// 명령어의 개수
		
		for (int j = 0; j < M; j++) {
			String command = sc.next();				// 명령어 입력
			
			switch (command) {
			case "I" :								// 커맨드가 I 입력되었을 때
				int xi = sc.nextInt();
				int yi = sc.nextInt();
				for(int k = 0; k <yi; k++ ) {
					int si = sc.nextInt();
					list.add(xi+k, si);				// x번째 암호문부터 y개 사이즈의 입력s를 삽입
				}
				break;	
			case "D" :
				int xd = sc.nextInt();
				int yd = sc.nextInt();
				for(int k = 0; k <yd; k++ ) {
					list.remove(xd+k);			// x번째 암호문부터 y개 삭제(I와 마찬가지로 0번 인덱스부터이므로 xd+k)
				}
				break;
				
			case "A" :
				int ya = sc.nextInt();
				for(int k = 0; k <ya; k++ ) {
					int sa = sc.nextInt();
					list.add(sa);			// 맨 뒤에 넣기
				}
				break;
			}
		}
		System.out.print("#" + test_case + " ");
			for (int i = 0; i < 10 && i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println();
	}	
}
}