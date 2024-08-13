package SWEA_6190_정곤이의단조증가하는수;

import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	
	public static void main(String args[]) throws Exception
	{
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int test_case = 1; test_case <= T; test_case++)
	{
	int N = sc.nextInt();
	int last = 1;
	int []num = new int[N];
	
	for(int i = 0; i < N; i++) {
		num[i] = sc.nextInt();
	}
	for (int j = 1; j < N-1; j++) {
		for (int k = j+1; k < N; k++) {
			// int AA = num[j]*num[k];
			if( num[j+1]*num[k] >= num[j]*num[k] && num[j]*num[k+1] >= num [j]*num[k] &&  ) {
				last = num[j]*num[k];
			}
			}
		}
	System.out.println("#" + test_case + " " + last);
	}
	}
}
	
//	for ( int i = 0; i < N; i++) {
//		int A = sc.nextInt();
//		if (A > last ) {
//			last = A;
//		} else {
//			
//		}
//	}
//	
//	if ( )
	