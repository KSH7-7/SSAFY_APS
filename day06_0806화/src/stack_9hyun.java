
public class stack {

	public static void main(String[] args) {
		private int max;
		private int top;
		private int[] stack;
		
		public Stack(int size) {
			this.max = size;
			this.stack = new int[max];
			this.top = -1;
		}
		
		public void push(int value) {
			if(top >= max-1) {
				return;
			}
			stack[++top] = value;
		}

		public int pop() {
			if (isEmpty()) {
				return -1;
			}
			int value = stack[top--];
			return value;
		}
		
		public Boolean isEmpty() {
			return ( top == -1);
		}
		
//		public int size() {
//			for()
//			return size;
//		}
//		
		public void clear() {
			for (int i = 0; i < size(); i++)
				stack.pop();
		}
	}

}
