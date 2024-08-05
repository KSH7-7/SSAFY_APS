package 문자열;

import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;


class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int size = 100;
        int [] box = new int[size];
        int [] counting = new int[size+1];
        int [] ans = new int[size];
        
		for(int test_case = 1; test_case <= T; test_case++)
		{        

			int dump = sc.nextInt();
			for (int i = 0; i < box.length; i++) {
                box[ i ] = sc.nextInt();
            }
            
            for  (int i = 0; i < box.length; i++) {
            	counting[ box[ i ] ]++;
            }
            
            for (int i = 1; i < counting.length; i++) {
			counting[ i ] += counting[ i - 1 ];
			}
            
            for ( int i = box.length - 1; i >= 0; i--) {
			int val = box[ i ];
			counting[val]--;
			ans[counting[val]] = val;
			}

		for( int i = 0; i < dump; i++) {
			Arrays.sort(ans);
			// System.out.println(Arrays.toString(ans));
			if(ans[99] - ans[0] <= 1)
				break;
			ans[99]--; ans[0]++;
			}
		Arrays.sort(ans);
		System.out.println("#" + test_case + " " + (ans[99] - ans[0]));
		}
	}
	}