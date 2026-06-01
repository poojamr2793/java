import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class GfG {
    static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        
        // Transfer all elements from queue to stack
        while (!q.isEmpty()) {
            st.push(q.peek());
            q.remove();
        }
        
        // Transfer all elements back from stack to queue
        // This reverses the order
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);
        
        reverseQueue(q);
        
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
