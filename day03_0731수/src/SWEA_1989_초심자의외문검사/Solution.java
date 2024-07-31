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
			String st=sc.nextLine();									// 문자 출력
			ArrayList<Character> list = new ArrayList<Character>();		// 리스트 선언
			for (int i = 0; i < st.length(); i++) {				// 문자를 리스트화
				list.add(st.charAt(i));
			}
			ArrayList<Character> rlist = new ArrayList<>(list);			// 반전시킬 리스트 초기화
			Collections.reverse(rlist);									// 해당 리스트 반전
			System.out.print("#" + test_case + " ");
			if (list.equals(rlist)) {									// 리스트와 반전된 리스트 비교
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}
}

