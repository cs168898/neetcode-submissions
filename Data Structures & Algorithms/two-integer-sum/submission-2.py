class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevMap = {}  # val -> index

        for i, num in enumerate(nums):
            difference = target - num
            if difference in prevMap: 
                return [prevMap[difference], i]
            prevMap[num] = i




            