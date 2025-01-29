class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);

            String sortedString = new String(ch);

            map.putIfAbsent(sortedString, new ArrayList<>());
            map.get(sortedString).add(s);
        }

        return new ArrayList<>(map.values());
    }
}