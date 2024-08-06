package SWEA_1224_계산기3;

public class stack_9hyun {

		private int max;
		private int top;
		private char[] stack;
		
		public stack_9hyun(int size) {
			this.max = size;
			this.stack = new char[max];
			this.top = -1;
		}
		
		public void push(char value) {
			if(top >= max-1) {
				return;
			}
			stack[++top] = value;
		}

		public char pop() {
			if (isEmpty()) {
				return '\0';
			}
			char value = stack[top--];
			return value;
		}
		
		public Boolean isEmpty() {
			return ( top == -1);
		}
		
		public char peek() {
			if (isEmpty()) {
				return '\0';
			}
			char value = stack[top];
			return value;
		}
		
//		public int size() {
//			for()
//			return size;
//		}
//		
//		public void clear() {
//			for (int i = 0; i < size(); i++)
//				stack.pop();
//		}
	}
