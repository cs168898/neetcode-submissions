class Solution {
    public int longestConsecutive(int[] nums) {
        // this will probably use sliding window algo
        
        int maxNo = 0;
        Arrays.sort(nums);
    
        for (int i = 0; i < nums.length ; i++){
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);

            int pointer = i + 1;

            while(pointer < nums.length){
                if (nums[pointer] == list.get(list.size() - 1) + 1){
                    // if we found a sequence....
                    list.add(nums[pointer]);
                    
                }
                
                pointer++;
            }
            // constantly update the highest number of sequences after list has been fully constructed
            // this also accounts for if pointer is not less than nums.length
            maxNo = Math.max(maxNo, list.size());
            
        }
        return maxNo;
    }
}
