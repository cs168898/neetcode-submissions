
//ATTEMPT 2: 15/9/2025
class Solution {
    public int lengthOfLongestSubstring(String s) {

        // a set to check seen characters
        // sliding window with 2 pointers
        // while it is a duplicate character, move the left pointer up
        // right pointer is the for loop 

        HashSet<Character> seen = new HashSet<>();
        int l = 0, max = 0;

        for(int r = 0; r < s.length() ; r++){
            while(seen.contains(s.charAt(r))){
                // while there is a duplicate char
                seen.remove(s.charAt(l));
                l++;
            }

            seen.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
