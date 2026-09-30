import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private final Queue<Integer> queue;


    public MyStack() {
        this.queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        int n = queue.peek();
        queue.poll();
        return n;

    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

}