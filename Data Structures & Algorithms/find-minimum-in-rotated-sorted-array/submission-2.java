class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(l<r){
            int m = l + (r - l) / 2;
            
            if(nums[m] > nums[r] ){
                //  we dont need to check m anymore because we know that the min number
                // cannot be greater than another number, therefore M isnt the min num
                l = m + 1;
            } else {
                // m could possibly still be the min num
                r = m;
            }
        }

        return nums[l];

    }
}
