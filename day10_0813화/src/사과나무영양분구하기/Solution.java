package 사과나무영양분구하기;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();									// 땅 크기
		int [][] farm = new int [N][N];							// 땅 배열
		int nut = 0;											// 영양분 합
		int max = 0;											// 영양분 최대치
		
		for ( int i = 0; i < N; i++) {
			for ( int j = 0; j < N; j++) {
				farm[i][j] = sc.nextInt();						// 각 구역의 영양분 입력
			}
		}
		for ( int i = 0; i < N-1; i++) {						// N-M+2이지만(중앙이 경계에 있는 경우) 가로세로 3 고정이므로 M=3
			for ( int j = 0; j < N-1; j++) {
				if ( (i-1) < 0 || (i+1) > N-1 || (j-1) < 0 || (j+1) > N-1) {
					continue;																	// 경계에 있는 경우에 대해서 처리
				}
				nut = farm[i][j] + farm[i-1][j] + farm[i+1][j] + farm[i][j-1] + farm[i][j+1];	// + 영역의 영양분 캐치

				if ( nut > max ) {								// 특정 구역의 영양분 합이 기존 최대치보다 높을 경우
					max = nut;									// 최대치 갱신
				}
			}
		}
		System.out.println(max);
		sc.close();
	}

}

// 설계 시간 : 5분
// 약 20분 경과 : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
// at 사과나무영양분구하기.Solution.main(Solution.java:21) -> 경계조건 처리
// 약 35분 경과 : if - continue를 nut 위로 올려서 미리 예외 처리 후 클리어