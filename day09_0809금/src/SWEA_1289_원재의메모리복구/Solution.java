package SWEA_1289_원재의메모리복구;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String N = sc.next();
			ArrayList<Integer> AL = new ArrayList<>();
			for (int i = 0; i < N.length(); i++ ) {
				AL.add(N.charAt(i));								// 입력받은 비트를 char 동적배열화
			}

			int cnt = 0;											// 카운트 초기화
			char bit = '0';											// 비트 초기화

			for ( int j = 0; j < AL.size(); j++) {
				if ( AL.get(i) != bit ) {							// 현재 비트와 이전 비트가 다르면 1회 뒤집힌것 like 오델로
					cnt++;											
					bit = AL.get(j);								// 비트 갱신						
				}
			}
			System.out.println("#" + test_case + " " + cnt);
	}
		sc.close();
}
}