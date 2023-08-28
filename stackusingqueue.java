class MyStack {

    Queue<Integer> k=new LinkedList<>();
    
    public void push(int x) {
        k.add(x);
    }
    
    public int pop() {
        int l=k.size();
        for(int i=0;i<l-1;i++){
            push(k.remove());
        }
        return k.remove();
    }
    
    public int top() {
        int l=k.size();
        for(int i=0;i<l-1;i++){
            push(k.remove());
        }
        int t=k.remove();
         push(t);
        return t;
    }
    
    public boolean empty() {
        return k.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */