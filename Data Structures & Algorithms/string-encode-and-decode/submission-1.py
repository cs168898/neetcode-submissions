class Solution:

    
    def encode(self, strs: List[str]) -> str:
        encodedString = ""
        

        if len(strs) == 0:
            return ""

        for word in strs:

            encodedString += str(len(word)) + '#' + word
       # encodedString will be something like 3#our4#fire

        return encodedString
    
    def decode(self, s: str) -> List[str]:
        decodedString = []
        
        pointer1 = 0
        while pointer1 < len(s):
            
            pointer2 = pointer1 # 1st: both is 0

            # check for the hex symbol
            while s[pointer2] != '#':
                pointer2 += 1

            length = int(s[pointer1:pointer2])

            pointer1  = pointer2 + 1 # get the first letter of word

            # from first char, add length to to find last letter and assign to pointer 2
            pointer2 = pointer1 + length

            decodedString.append(s[pointer1:pointer2])

            # reset the pointers to find new word
            
            pointer1 = pointer2

        return decodedString
            


    
    