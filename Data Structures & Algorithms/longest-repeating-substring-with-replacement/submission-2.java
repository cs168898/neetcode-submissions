class Solution {
    public int characterReplacement(String s, int k) {
        //max window size - highest frequency letter count = no. of letters to replace
        //if no. of letters to replace is > k , we reduce window size
        HashMap<Character, Integer> count = new HashMap<>();

        int l = 0;
        int res = 0;

        for(int r = 0; r < s.length() ; r++){
            int maxwindowsize = r - l + 1;

            // calculate the highest count after putting in the new char
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            int highestcount = Collections.max(count.values());

            // if number of letters to replace is larger than k...
            if((maxwindowsize - highestcount) > k ){
                // reduce the count of the character at left pointer
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                
                // reduce the window size
                l++;
                
            }

            res = Math.max(r - l + 1, res);
            
        }
        return res;

    }
}
