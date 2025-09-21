import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.offer(x); // push to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll()); // move all elements from q1 to q2
        }
        // swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll(); // top element is always at front of q1
    }

    public int top() {
        return q1.peek(); // front element is top
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
