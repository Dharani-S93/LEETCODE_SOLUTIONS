class MyStack {
    public Queue<Integer> firstQueue;
    public Queue<Integer> secondQueue;

    public MyStack() {
        firstQueue = new LinkedList<>();
        secondQueue = new LinkedList<>();
        
    }
    
    public void push(int x) {
        while(firstQueue.size()>0){
            secondQueue.add(firstQueue.remove());
        }
        firstQueue.add(x);

        while(secondQueue.size()>0){
            firstQueue.add(secondQueue.remove());
        }
    }
    
    public int pop() {
        return firstQueue.remove();
        
    }
    
    public int top() {
        return firstQueue.peek();
        
    }
    
    public boolean empty() {
        if(firstQueue.size()==0){
            return true;
        }else{
            return false;
        }
        
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