import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();									// 총 테스트 케이스 개수
		int [] rep = new int[T];								// 각 테스트 케이스에 자동적으로 크기 저장
		for (int test_case = 0; test_case < T; test_case++) {  // 테스트 케이스 반복
			rep[test_case] = sc.nextInt();
		}	
		
			for (int test_case = 0; test_case < T; test_case++) {	
			int N = rep[test_case];								// 달팽이의 크기 N*N
			int [][] snail = new int [N][N];					// 달팽이 배열 초기화
			int top = 0;										// 0번 행을 0으로 규정
			int left = 0;										// 0번 열을 0으로 규정
			int bottom = N-1;									// 가장 끝행이므로 N-1
			int right = N-1;									// 가장 끝열이므로 N-1
			int index = 1;										// i 대신 별도의 변수
				while ( top <= bottom && left <= right) {		// 가장 안쪽으로 말릴 때까지 반복
					for ( int i = top; i <= bottom; i++) {		// 아래로 전개
						snail[i][left] = index++;			
						}
						left++;									// 사이드 따라 우로 이동
				for ( int i = left; i <= right; i++) {			// 우로 전개
					snail[bottom][i] = index++;				
				}
				bottom--;										// 사이드 따라 위로 이동
				for ( int i = bottom; i >= top; i--) {			// 위로 전개
					snail[i][right] = index++;				
				}
				right--;										// 좌로 이동
				for ( int i = right; i >= left; i--) {			// 좌로 전개
					snail[top][i] = index++;				
				}
				top++;
	}
				System.out.println("#" + test_case);			// #테스트 케이스
				for ( int i = 0; i < N; i++) {
					for ( int j = 0; j < N; j++) {
						System.out.print(snail[i][j] + "\t");			// 달팽이
					}											// snail -> snail[][] 
					System.out.println();
				}
				
	}															// 테스트 반복 종료
		sc.close();												// 스캐너 종료
	}

}
