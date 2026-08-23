class MinStack {

    int[] mins ;
    int[] stack;
    int top , top1;
    public MinStack() {
        top = -1;
        top1 = -1;
        mins = new int[30001] ;
        stack = new int[30001] ;
    }
    
    public void push(int value) {

        stack[++top] = value ;

        if(top1 == -1 || value <= mins[top1] ){
            mins[++top1] = value;
        }  
    }
    
    public void pop() {
        if(stack[top] == mins[top1]){
            top1--;
        }
        top--;
    }
    
    public int top() {
        return stack[top];
        
    }
    
    public int getMin() {
        return mins[top1];
        
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
