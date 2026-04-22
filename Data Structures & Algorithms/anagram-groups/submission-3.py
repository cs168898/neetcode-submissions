class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        myDict = {}

        for item in strs:
            stringItem = "".join(sorted(item))
            
            if stringItem in myDict:
                # append the item to the existing array if it exists
                myDict[stringItem].append(item)
            else:
                # create an array of the current item 
                # if it DNE
                myDict[stringItem] = [item]
        # create final array that consist of all the dictionary values

        finalArray = (myDict.values())
        print(finalArray)
        return finalArray

