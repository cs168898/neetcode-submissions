

class Solution {
    public int[] twoSum(int[] nums, int target) {

        //map <Integer, Integer(index)>
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){
            int numToFind = target - nums[i];
            if (map.containsKey(numToFind)){
                int[] numbers = {map.get(numToFind), i};
                return numbers;
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
