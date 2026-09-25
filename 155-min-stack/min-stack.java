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
       
