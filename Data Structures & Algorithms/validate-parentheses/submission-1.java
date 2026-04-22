class Solution {
    public boolean isValid(String s) {

       HashMap<Character, Character> map = new HashMap<>();
       Stack<Character> stack = new Stack<>();

        // create the map to check the value whenever we meet the closing bracket as the key 
       map.put('}', '{');
       map.put(']', '[');
       map.put(')', '(');

       for(char c : s.toCharArray()){

            if(map.containsKey(c)){

                if(!stack.isEmpty() && stack.peek() == map.get(c)){
                    // this loop will activate if it is a closing bracket and stack is not empty

                    stack.pop();
                } else {
                    // if the top of the stack does not match the key value pair
                    return false;
                }
            } else {
                // add to the stack if it has not been seen before
                stack.push(c);
            }
        
       }

       return stack.isEmpty();
       
    }
}
