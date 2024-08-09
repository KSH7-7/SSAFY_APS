package SWEA_4613_러시아국기같은깃발;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) throws Exception
	{


		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
		 int N = sc.nextInt();							// 행 길이 입력
		 int M = sc.nextInt();							// 열 길이 입력
		 int min = 0;									// 최솟값 초기화
		 String [][] flag = new String [N][M];			// 국기 배열
		 String [] sumc = new String [N];				// 행에서 가장 많은 색
		 
		 for (int i = 0; i < N; i++) {
			 for (int j = 0; j < M; j++) {
				 flag [i][j] = sc.next(); 				// 국기 입력
			 }
		 }
		 
		 for (int j = 0; j < M; j++) {					// 맨윗줄과 맨 아랫줄은 고정이므로 먼저 카운팅
			 if ( flag [0][j] != "W" ) {
				 min += 1;								// 첫째행에서 하얀색으로 칠해야 하는 칸 카운트 
			 } else if ( flag[N-1][j] != "R" ) {
				 min += 1;								// 마지막 행에서 빨간색을 칠해야하는 칸 카운트
			 }
		 }
		 for (int i = 1; i < N-2; i++) {
			 for(int j = 0; j < M; j++) {
				 switch (flag[i][j] )
			 }
		 }
		 
		 
		 for (int i = 0; i < N; i++) {
			 for (int j = 0; j < M; j++) {
				 switch 
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 for (int)
		 
		 
		System.out.println("#" + test_case + " " + min);
		}
		sc.close();
	}
}