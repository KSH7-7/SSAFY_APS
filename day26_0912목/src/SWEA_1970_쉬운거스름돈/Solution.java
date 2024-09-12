package SWEA_1970_쉬운거스름돈;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int T =sc.nextInt();

        for(int tc = 1; tc <= T; tc++) {
		int cash = sc.nextInt();                // 처음 받는 돈
        int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };   // 화폐 종류 배열
        int [] arr = new int [8];               // 거스름돈에 대한 배열
        for(int i = 0; i < 8; i++) {
        if ( cash >= money[i] ) {
            arr[i] = cash / money[i];           // cash가 화폐 종류 배열의 각 인덱스보다 크면 몫을 구하여 거스름돈 배열에 넣는다.
            cash %= money[i];                   // 남는 금액을 갱신
        }
    }
		System.out.println("#" + tc + " ");
        for(int j = 0; j < 8; j++ ) {
        System.out.print(arr[j] + " ");         // 출력
        }
        System.out.println("");
    }
    sc.close();
	}
}