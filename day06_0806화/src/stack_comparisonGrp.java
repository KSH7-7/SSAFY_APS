// import java.util.EmptyStackException;

// LinkedList 기반
public class stack_comparisonGrp {
    private Node<T> top; // 스택의 맨 위 노드를 가리키는 참조
    private int size;    // 스택의 크기

    // Node 클래스 정의
    private static class Node<T> {
        private T data;   // 노드에 저장되는 데이터
        private Node<T> next; // 다음 노드를 가리키는 참조

        public Node(T data) {
            this.data = data;
        }
    }

    public CustomStack() {
        this.top = null; // 스택이 비어 있음을 나타내는 초기값
        this.size = 0;   // 초기 스택 크기
    }

    // Push element onto the stack
    public T push(T data) {
        Node<T> newNode = new Node<>(data); // 새로운 노드를 생성
        newNode.next = top; // 새로운 노드의 다음 노드를 현재 top으로 설정
        top = newNode; // top을 새로운 노드로 갱신
        size++; // 스택 크기 증가
        return data; // 추가된 데이터를 반환
    }

    // Pop element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T data = top.data; // 현재 top의 데이터를 저장
        top = top.next; // top을 다음 노드로 갱신
        size--; // 스택 크기 감소
        return data; // 제거된 데이터를 반환
    }

    // Peek at the top element of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data; // 현재 top의 데이터를 반환
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null; // top이 null이면 스택이 비어있음을 의미
    }

    // Search for an element in the stack and return its 1-based position from the top
    public int search(Object o) {
        int position = 1;
        for (Node<T> current = top; current != null; current = current.next) {
            if (current.data.equals(o)) {
                return position;
            }
            position++;
        }
        return -1; // Return -1 if the element is not found
    }

    // Get the size of the stack
    public int size() {
        return size; // 스택의 크기를 반환
    }
}

// node 없이 배열 기반
// private static final int DEFAULT_CAPACITY = 10;
//     private T[] elements;
//     private int size;

//     public CustomArrayStack() {
//         this.elements = (T[]) new Object[DEFAULT_CAPACITY];
//         this.size = 0;
//     }

//     // Push element onto the stack
//     public T push(T data) {
//         ensureCapacity();
//         elements[size++] = data;
//         return data;
//     }

//     // Pop element from the stack
//     public T pop() {
//         if (isEmpty()) {
//             throw new RuntimeException("Stack is empty");
//         }
//         T data = elements[--size];
//         elements[size] = null; // Clear the reference for garbage collection
//         return data;
//     }

//     // Peek at the top element of the stack without removing it
//     public T peek() {
//         if (isEmpty()) {
//             throw new RuntimeException("Stack is empty");
//         }
//         return elements[size - 1];
//     }

//     // Check if the stack is empty
//     public boolean isEmpty() {
//         return size == 0;
//     }

//     // Get the size of the stack
//     public int size() {
//         return size;
//     }

//     // Ensure the array has enough capacity to hold new elements
//     private void ensureCapacity() {
//         if (size == elements.length) {
//             elements = Arrays.copyOf(elements, 2 * size);
//         }
//     }

//     // Search for an element in the stack and return its 1-based position from the top
//     public int search(Object o) {
//         for (int i = size - 1; i >= 0; i--) {
//             if (elements[i].equals(o)) {
//                 return size - i;
//             }
//         }
//         return -1; // Return -1 if the element is not found
//     }