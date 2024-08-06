package SWEA_1222_계산기1;

import java.util.Scanner;
//import SWEA_1222_계산기1.stack_9hyun;

public class Solution {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	for(int test_case = 1; test_case <= 10; test_case++)
	{
	int L = sc.nextInt();
	String expression = sc.next();
	
	String postfix = infixToPostfix(expression);
//	System.out.println(postfix);
	int result = evalPostfix(postfix);
	System.out.println("#" + test_case + " " + result);
	}
	sc.close();
	}
	
	static int evaluate(String expression) {
		String postfix = infixToPostfix(expression);
		return evalPostfix(postfix);
	}
	
	
	static String infixToPostfix(String infix) {	// 중위 표기식
		
		String postfix = "";						// 길이가 0인 문자열로 초기화
//		 stack_9hyun stack = new stack_9hyun<Character>();
		
		for (int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);
			
			// 피연산자가 나오면 바로 출력
			if ('0' <= c && c <= '9') {
				postfix += c;
			} else {
				stack.push(c);
			}
		}
		
		// 스택 비워주기
		while (!stack.isEmpty()) {
			postfix += stack.pop();
		}
		
		return postfix;
	}

	static int evalPostfix(String postfix) {
		
//		stack_9hyun<Character> stack = new stack_9hyun<>();
		
		for ( int i = 0; i < postfix.length(); i++) {
			char c = postfix.charAt(i);
			
			if ('0' <= c && c <= '9') {
				stack.push( c - '0');					// 빼야 정수가 들어감
			} else {
				int num2 = stack.pop();
				int num1 = stack.pop();
				int result;
				
				result = num1 + num2;
				stack.push(result);
			}
		}
		return stack.pop();
	}
	
	
}