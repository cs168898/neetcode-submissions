class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # since there are a specific number of input, 
        # we can use array indexes as the number of occurences
        # 1. Store the number of occurences
        # 2. Retrieve the number of occurences by iterating
        # from behind to get the most frequent occurence
        # 3. Once we got k numbers, we stop and return

        array = []
        myDict = {}

        for i in range(len(nums) + 1):
            array.append([])
        
        #create map to store each number and its frequency

        for num in nums:
            if num in myDict:
                # if key already exists
                myDict[num] += 1
            else:
                #if key does not exist
                myDict[num] = 1
        
        # Store the dict values into array
        for num, cnt in myDict.items():
            # store the number itself as the value using frequency as key
            # index is the original number
            # value is the frequency
            array[cnt].append(num) 
        
        
        
        finalArray = []
        print (array)
        #now we have an array that stores its frequency as index
        # Create a for loop to iterate from behind
        for i in range(len(array) -1, 0 , -1):
            # we access each number in the current 
            # iteration of array
            for num in array[i]:
                finalArray.append(num)
            if len(finalArray) == k:
                return finalArray

        

