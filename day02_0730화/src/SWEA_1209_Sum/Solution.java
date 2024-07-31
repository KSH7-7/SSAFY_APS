package SWEA_1209_Sum;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = 100;
		int[][] arr = new int[N][N];

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sumex[] = new int[N];
		int sumwhy[] = new int[N];
		int sumN = 0;
		int sumM = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sumex[i] += arr[i][j];
				sumwhy[j] += arr[i][j];
			}
		}
		int maxra = 0;
		int maxnm = 0;
		for(int i = 0; i < N; i++) {
				sumN += arr[i][i];
				sumM += arr[i][N-1-i];
		}
		
		for(int i=1; i<N; i++) {
			maxra = Math.max(maxra, sumex[i]);
            maxra = Math.max(maxra, sumwhy[i]);
		
		maxnm = Math.max(sumN, sumM);
		}
		
		int totmax = Math.max(maxnm, maxra);
            System.out.print("#" + test_case + " ");
            System.out.println(totmax);			// 두번째 케이스부터 답이10 차이나더니 자잘하게 오답...이 떠서 
												// 장시간에 걸쳐 해결하려 했음에도 실패했습니다...
		}
	}
}