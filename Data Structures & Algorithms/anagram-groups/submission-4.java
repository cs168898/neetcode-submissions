class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // sort each individual string in the list of strings
        // add it as a key to a hashmap and its value is the real word
        // then for each value in the map , create a list of list to store all the values

        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> output = new ArrayList<>();

        for(String s : strs){
            // convert to array to sort
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            // create a string through the sorted array
            String sorted = new String(chars);

            // put the real value
            if(map.containsKey(sorted)){
                List<String> list = map.get(sorted);
                list.add(s);
            } else {
                // create a new array list and add it to the map
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sorted, list);
            }
            
        }
        for (List<String> group : map.values()){
            output.add(group);
        }
        
        return output;

        

    }
}
