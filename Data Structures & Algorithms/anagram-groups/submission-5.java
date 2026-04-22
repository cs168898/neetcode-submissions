

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // key will be the frequency map counts
        // value is the real word
        // use a frequency map by initializing 26 (number of letters in alphabet) 0s in a count array like [0,0,0,...]
        // then find the index of the current character and increment the count by 1
    
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            
            int[] count = new int[26];
            for(char c : str.toCharArray()){
                count[c - 'a'] += 1; // add one to the relevant position in the frequency map
            }

            String key = Arrays.toString(count); // this creates a key that is a string like: "[1,0,0,2,0]"

            map.putIfAbsent(key, new ArrayList<>()); // adds the key and value if its not present
            map.get(key).add(str);
            
        }
        return new ArrayList<>(map.values());
    }
}
