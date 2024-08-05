package SWEA_1218_괄호짝짓기;

import java.util.Scanner;

public class Solution
{
	
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int L = sc.nextInt();
            Stack stack = new Stack(L);
            int eff = 1;
            for (int i = 0; i < L; i++) {
                String S = sc.next();
                    String ST = stack.top();
                	if ( (S.equals(")") && "(".equals(ST)) 
                			|| ( S.equals("}") && "{".equals(ST)) 
                			|| (S.equals("]") && "[".equals(ST)) 
                            || (S.equals(">") && "<".equals(ST)) ) {
                		stack.pop();
                	} else if (S.equals("(") 
                    || S.equals("{") 
                    || S.equals("[") 
                    || S.equals("<")) {
                        stack.push(S);
                    } else {
                        eff = 0;
                        break;
                    }
            }
            
            if (!stack.isEmpty()) {
            	eff = 0;
            }

         System.out.println("#" + test_case + " " + eff); 

		}

	}
}

class Stack {
	private int max;
	private int top;
	private String[] stack;
	
	public Stack(int size) {
		this.max = size;
		this.stack = new String[max];
		this.top = -1;
	}
	
	public void push(String word) {
		if ( top >= max - 1) {
			return;
		}
		stack[++top] = word;
	}
	
	public String pop() {
		if (isEmpty()) {
			return null;
		}
		return stack[top--];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
    
	public String top() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }
	
}