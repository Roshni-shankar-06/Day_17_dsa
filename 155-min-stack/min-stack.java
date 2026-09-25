import java.util.Stack;

class MinStack {
    // A private helper class to store the value and the minimum up to this point
    private static class Node {
        int val;
        int min;

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    private Stack<Node> stack;

    /** Initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }
    
    /** Push element val onto the stack. */
    public void push(int val) {
        if (stack.isEmpty()) {
            // If the stack is empty, the current value is the absolute minimum
            stack.push(new Node(val, val));
        } else {
            // Otherwise, find the minimum between the new value and the current top's minimum
            int currentMin = Math.min(val, stack.peek().min);
            stack.push(new Node(val, currentMin));
        }
    }
    
    /** Removes the element on top of the stack. */
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }
    
    /** Get the top element of the stack. */
    public int top() {
        return stack.peek().val;
    }
    
    /** Retrieve the minimum element in the stack. */
    public int getMin() {
        return stack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
