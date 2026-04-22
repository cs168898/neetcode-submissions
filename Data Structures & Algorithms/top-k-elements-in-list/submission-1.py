class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        myDict = {}

        for num in nums:
            if num in myDict:
                myDict[num].append(num)
            else:
                myDict[num] = [num]
            
        sortedList = sorted(list(myDict.values()), key=len)
        sortedListReverse = sortedList[::-1]
        i = 0
        finalList = []
        print ('sortedlist = ', sortedList)
        while i<k:
            finalList.append(sortedListReverse[i][0])
            i += 1

        return finalList
