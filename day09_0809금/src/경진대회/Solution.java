import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();										// 테스트 케이스 사이즈																			
		for ( int test_case = 1; test_case <= T; test_case++) {
			char sero;												// 최종적으로 읽을 세로줄모음 초기화
			String [] garo = new String [5];					// 작성할 문자열은 5개, 매번 초기화
			for(int i = 0; i < 5; i++) {
				garo[i] = sc.next();								// 문자열 5개 입력
			}
			
			System.out.print("#" + test_case + " ");
			
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
				sero = garo[j].charAt(i);							// 각 문자열의 특정 부분을 세로로 변형
//				if ( garo[j].charAt(i) = null ) {
//					return "";
//				}		
				System.out.print(sero);								// 세로로 읽은 문자의 합을 읽음
				}
			}
			System.out.print("\n");									// 다음 테스트 케이스를 위한 줄바꿈
		}
		sc.close();
	}

}

// 샘플 결과창
//#1 Aa0FfBb1GgCc2HhDd3IiEe4Jj
//
//#2 Aa0aPAf985Bz1EhCz2W3DException in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 4
//	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//	at java.base/java.lang.String.charAt(String.java:1517)
//	at SERORO.main(SERORO.java:20)
