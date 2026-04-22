

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(char str: s.toCharArray()){
            if(mapS.containsKey(str)){
                int count = mapS.get(str);
                mapS.put(str, count+1);
            } else {
                // if mapS does not have existing key
                mapS.put(str, 1);
            }
        }

        for(char str: t.toCharArray()){
            if(mapT.containsKey(str)){
                int count = mapT.get(str);
                mapT.put(str, count+1);
            } else {
                // if mapT does not have existing key
                mapT.put(str, 1);
            }
        }

        return mapS.equals(mapT);
    }
}
