
class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        // If minSt is empty, val is the minimum; otherwise take the min between val and current min
        if (minSt.isEmpty()) {
            minSt.push(val);
        } else {
            minSt.push(Math.min(val, minSt.peek()));
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
            minSt.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }
}