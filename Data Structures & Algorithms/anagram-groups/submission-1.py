class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        myDict = {}

        for item in strs:
            # create the key that will be used to identify
            key = ''.join(sorted(item))

            # if key exist in dictionary
            if key in myDict:
                myDict[key].append(item)
            else:
                #if the item does not exist yet,
                #we create the key and value using the original word
                myDict[key] = [item]
        return list(myDict.values())

            

            

            