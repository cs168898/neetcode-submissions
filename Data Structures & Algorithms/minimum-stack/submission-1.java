class MinStack {

    private long min;
    private Stack<Long> stack;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        // in order to keep track of all numbers to find out min number, we have to track the difference
        // with the current iteration number with the current min value
        
        if (stack.isEmpty()){
            // since the first value will always be min, and we store the difference , it will always be 0
            // for the first value
            stack.push(0L);
            // for the first pushed value, assign it to the min variable
            min = val;
        } else {
            
            stack.push((val - min));
            if(val < min) min = val;
        }
        
        
    }
    
    public void pop() {
        if (stack.isEmpty()){
            return;
        }
        Long pop = stack.pop();
        // since negative numbers in the stack indicate a change in the min stack
        // if the popped number is negative, we should update the min number
        if (pop < 0){
            min = min - pop;
        }
    }

    public int top() {
        // we have to return the calculated number
        if(stack.peek() > 0){
            return (int) (stack.peek() + min);
        } else {
            // if we foudn a negative number, 
            // it means that we met the min number
           // since min number only changes during negative numbers 
            // so we can just return the min number
            return (int) min;
        }
        
    }

    public int getMin() {
        return (int) min;
    }
}
