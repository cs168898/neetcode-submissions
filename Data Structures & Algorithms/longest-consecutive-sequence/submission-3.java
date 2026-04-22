class Solution {
    public int longestConsecutive(int[] nums) {
        // this will probably use sliding window algo
        
        Set<Integer> numSet = new HashSet<>();

        for ( int num : nums ){
            numSet.add(num);
        }

        int maxlength = 0;

        for (int num : numSet){
            
            
            // to ensure that it is the lowest possible number in the set
            if (!numSet.contains(num - 1)){
                // start the length count only when it is the lowest number
                int length = 1;
                // while there is a number that is incrementing by 1 together with the length variable
                while(numSet.contains(num + length)){
                    length++;
                }
                maxlength = Math.max(length, maxlength);
            }

            
        }

        return maxlength;
    }
}
