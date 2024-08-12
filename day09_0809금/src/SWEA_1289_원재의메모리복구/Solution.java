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
        int i;
        ArrayList<Integer> AL = new ArrayList<>();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int length = 0;
			int cnt = 0;
             for (i = 0; i < length; i++) {
            	 int value = sc.nextInt();
            	 AL.add(value);
             }
             for (i = 0; i < length; i++) {
            if ( AL.get(i) == 0 && AL.get(i+1) == 1) {
                    cnt++;
                }
                if (AL.get(i) == 1 && AL.get(i+1) == 0) {
                    cnt++;
                    if (AL.get(i) == 1) {
                        cnt++;
                    }
                }
             }
            System.out.println("#" + test_case + " " + cnt);
	}
		sc.close();
}
}