class CustomStack {
    int[] stack;
    int length;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        length = 0;
    }
    
    public void push(int x) {
        if(length<stack.length){
            stack[length++] = x;
        }
    }
    
    public int pop() {
        if(length==0){
            return -1;
        }
        return stack[--length];
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<k && i<stack.length;i++){
            stack[i] += val;
        }   
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */