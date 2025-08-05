package Stack;

import java.util.Stack;

class MyQueue {
    Stack<Integer> st;
    Stack<Integer> st2;

    public MyQueue() {
        st = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        shiftStack();
        return st2.pop();
    }

    public int peek() {
        shiftStack();
        return st2.peek();
    }

    public boolean empty() {
        return st.isEmpty() && st2.isEmpty();
    }

    public void shiftStack() {
        if (st2.isEmpty()) {
            while (!st.isEmpty()) {
                st2.push(st.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */