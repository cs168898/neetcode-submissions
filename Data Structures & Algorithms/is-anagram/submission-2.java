class Solution {
    public boolean isAnagram(String s, String t) {
        // create a map to map the first string as key value pairs (letter, frequency)
        HashMap<Character, Integer> seen = new HashMap<>();

        // map the first string into the Hashmap
        for(char c : s.toCharArray()){
            seen.put(c , seen.getOrDefault(c, 0) + 1);
        }

        // check through the seen map if all characters are present
        // reduce by 1 frequency each time it is present
        // if cant reduce,  return false
        // if its not present , return false
        // if can reduce and everything is present, return true;
        for(char c : t.toCharArray()){
            if(seen.containsKey(c)){
                if(seen.get(c) == 0){
                    // if the frequency is 0 , return false
                    return false;
                }else {
                    seen.put(c , seen.get(c) - 1);
                }
            } else {
                // if seen dont contain the key , return false
                return false;
            }
        }

        return seen.values().stream().allMatch(count -> count == 0);
    }
}
