class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(nums);

        for ( int i = 0; i < nums.length ; i++){
            // since 3 positive numbers cant form 0, in a sorted array
            if(nums[i] > 0) break;
            //we have to also remove duplicates for i in a sorted array
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l<r){
                int sum = nums[l] + nums[r] + nums[i];

                if (sum == 0){
                    output.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    // create another duplicate check for left pointer
                    // if left is still less than right
                    // and there is duplicate number for left pointer...
                    while(l < r && nums[l] == nums[ l - 1 ]) l++;
                } else if(sum > 0){
                    r--;
                } else if(sum < 0){
                    l++;
                }

            }
            
        }
        return output;
    }
}
