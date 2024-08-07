package SWEA_3499_퍼펙트셔플;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	
//	static String[] queue = new String[10];
//	static int front = -1;
//	static int rear = -1;
	
	public static void main(String[] args) {
	Queue<String> queue1 = new LinkedList<>();
	Queue<String> queue2 = new LinkedList<>();
	Scanner sc = new Scanner(System.in);
//	int T = sc.nextInt();
	// TC 시ㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣ작합니다ㅏㅏㅏㅏㅏㅏㅏㅏ
	int N = sc.nextInt();
	int ans = N / 2;
	for(int i = 0; i < N; i++) {
		if ( i < (N+1)/2) {
			String card = sc.next();
			queue1.offer(card);
		} else {
			String card = sc.next();
			queue2.offer(card);
		}
	}
	for(int i = 0; i < N/2; i++) {
		System.out.print(queue1.poll());
		System.out.print(queue2.poll());
	}
	}
}