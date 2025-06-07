class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;

    //    List<Character> list = new ArrayList<>();

    //     while(end < s.length()){
    //         if(!list.contains(s.charAt(end))){     
    //             list.add(s.charAt(end));
    //             end++;
    //             maxLength = Math.max(maxLength, list.size());

    //         }
    //         else{
    //             list.remove(Character.valueOf(s.charAt(start)));
    //             start++;
    //         }
    //     }
    //     return maxLength;

        HashSet<Character> set = new HashSet<>();  // HashSet to check for duplicates in constant time.
        while (end < s.length()) {
            char currentChar = s.charAt(end);
            
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength;

    }
}