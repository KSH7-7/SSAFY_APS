package SWEA_2805_농작물수확하기;

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // N 값을 각 테스트 케이스마다 입력받도록 수정
           
            String[][] value = new String[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    value[i][j] = sc.next();
                }
            }
            String sum = "";
            for (int i = 0; i < N; i++) {
                for (int j = Math.max(0, (N - 1) / 2 - i); j <= Math.min(N - 1, (N - 1) / 2 + i); j++) {
                    sum += value[i][j];
                }
            }

            System.out.println("#" + test_case + " " + sum);
        }
        sc.close();
    }
}



// c를 그대로 쓰면 아스키코드로 입력 되기에 c - '0' 항상 유의