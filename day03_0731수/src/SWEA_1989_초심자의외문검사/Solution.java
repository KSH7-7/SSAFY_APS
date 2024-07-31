package SWEA_1989_초심자의외문검사;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String st=sc.nextLine();
			ArrayList<Character> list = new ArrayList<Character>();
			for (int i = 0; i < st.length(); i++) {				// 문자를 리스트화
				list.add(st.charAt(i));
			}
			ArrayList<Character> rlist = new ArrayList<>(list);
			Collections.reverse(rlist);
			System.out.print("#" + test_case + " ");
			if (list.equals(rlist)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}
}




		// for(int test_case = 1; test_case <= T; test_case++)
		// {
		// 	String st=sc.nextLine();
		// 	if (isPalindrome(st)) {
		// 		System.out.println("1");
		// 	} else {
		// 		System.out.println("0");
		// 	}
		// }
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
