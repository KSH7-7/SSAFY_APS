package SWEA_1222_계산기1;

public class stack_9hyun<T> {

		private int max;
		private int top;
		private T[] stack;
		
		public stack_9hyun(int size) {
			this.max = size;
			this.stack = (T[]) new Object[max];
			this.top = -1;
		}
		
		public void push(T value) {
			if(top >= max-1) {
				return;
			}
			stack[++top] = value;
		}

		public T pop() {
			if (isEmpty()) {
				return null;
			}
			T value = stack[top--];
			return value;
		}
		
		public Boolean isEmpty() {
			return top == -1;	
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
