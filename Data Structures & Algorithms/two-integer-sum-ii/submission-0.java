
// ATTEMPT 2: 8/9/2025
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // use 2 pointer approach, since sorted in increasing order
        // if sum of both pointers is less than target, increment left pointer
        // if sum of both pointers is more htan target, increment right pointer
        
        int l = 0, r = numbers.length - 1;

        while ( l < r){
            int sum = numbers[l] + numbers[r];
            if(sum < target){
                l++;
            } else if(sum > target) {
                r--;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }
        return new int[0];
    }
}