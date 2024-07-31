package SWEA_1989_초심자의외문검사;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int ans;
//		String st=sc.nextLine();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			char ts = ' ';
			String st=sc.nextLine();
			char[] stArray = st.toCharArray();
//			System.out.println(Arrays.toString(stArray));
			for (int i=st.length(); i >0; i-- ) {
				ts = st.charAt(i);
				System.out.println(ts);
			}
//			for (int i = 0; i < st.length(); i++) {
//				arr[i] = st.charAt(i);
//			}
//			List<Integer> list = Arrays.asList(arr);
//			Collections.reverse(list);
//			if (list == Collections.reverse(list)) {
//				ans = 1;
//			} else {
//				ans = 0;
//			}
//			System.out.print("#" + test_case + " ");
//			System.out.println(ans);


		}
	}
}