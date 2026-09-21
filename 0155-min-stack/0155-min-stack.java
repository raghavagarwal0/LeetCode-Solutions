import java.util.ArrayDeque;
import java.util.Deque;
class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int value) {
        if(stack.isEmpty() || minStack.peek()>=value)
        {
            minStack.push(value);
        }
        stack.push(value);
    }
    
    public void pop() {
        if(!minStack.isEmpty() && stack.peek().equals(minStack.peek()))
        {
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */