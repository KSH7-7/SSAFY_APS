package SWEA_1225_암호생성기;

import java.util.Scanner;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Queue;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
        {
            for(int i=0; i < 8; i++) {
                int n = sc.nextInt();
                queue.add(n);
            }
            for(int i=0; i < 8; i++) {
            	int index = queue.poll();
            	int mod = index % 40;
            	queue2.offer(mod);
            }
            int m = 0, j;
            while (true) {
                for(j = 1; j <= 5; j++) {
                    m = queue2.peek();
                    queue2.poll();
                    queue2.offer(m-j);
                    }
                if (m-j <= 0) {
                	m-j == 0;
                	break;
                }
                
            }
                System.out.println("#" + test_case + " " + queue2);
                }
            }
	}