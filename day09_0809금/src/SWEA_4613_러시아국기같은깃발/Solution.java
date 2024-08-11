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
		 String [][] flag = new String [N][M];			// 국기 배열
		  int minP = 0;									// 칠하는 최솟값
		 
		 for (int i = 0; i < N; i++) {
			 for (int j = 0; j < M; j++) {
				 flag [i][j] = sc.next(); 				// 국기 입력
			 }
		 }
		 int min = 0;									// 최솟값 초기화
		 
		 for (int j = 0; j < M; j++) {					// 맨윗줄과 맨 아랫줄은 고정이므로 먼저 카운팅
			 if ( !flag [0][j].equals("W") ) {
				 min += 1;								// 첫째행에서 하얀색으로 칠해야 하는 칸 카운트 
			 } 
			 if ( !flag[N-1][j].equals("R") ) {
				 min += 1;								// 마지막 행에서 빨간색을 칠해야하는 칸 카운트
			 }
		 }

		 int paint = Integer.MAX_VALUE;


		 for (int i = 1; i < N-1; i++) {				// 파란색 배치에 대한 전개(중간이라 핵심)
			 for(int j = i; j < N-1; j++) {
				 int cnt = 0;
			 
		 for (int m = 1; m <= i; m++) {
			 for (int k = 0; k < M; k++) {
				 if ( !flag[m][k].equals("W") ) {		
					cnt++;								// 하얀색 칠하기
				 }
			 }
		 }
		 
		 for (int n = i+1; n <= j; n++) {
			for ( int k = 0; k < M; k++) {
				if ( !flag[n][k].equals("B") ) {
					cnt++;								// 파란색 칠하기
				}
			}
		 }

		 for (int l = j+1; l < N-2; l++) {
			for (int k = 0; k < M; k++) {
				if ( !flag [l][k].equals("R") ) {
					cnt++;								// 빨간색 칠하기
				}
			}
		 }
		 paint = Math.min(paint, cnt);
		}
		}
		 
		min += paint;						// Math.min()을 이용해서 최솟값 도출
		System.out.println("#" + test_case + " " + min);
		}
		sc.close();
	}
}