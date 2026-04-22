class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        #return a single array where the array numbers consist of 
        # the product of all other elements in the array except itself

        finalArray = []
        prefix = 1
        for num in nums:

            finalArray.append(prefix)
            # this prefix accounts for the prev numbers already
            prefix = prefix * num
        print('finalarray after prefix', finalArray)
        # multiple postfix in
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            
            finalArray[i] *= postfix
            postfix *= nums[i]

        print(finalArray)
        return finalArray


        