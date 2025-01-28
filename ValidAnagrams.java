class Solution {
    public boolean isAnagram(String s, String t) {
       
       if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        // char[] charArray1 = s.toCharArray();
        // char[] charArray2 = t.toCharArray();

        // // Sort the character arrays
        // Arrays.sort(charArray1);
        // Arrays.sort(charArray2);

        // // Compare the sorted arrays
        // return Arrays.equals(charArray1, charArray2);

        int frequency[] = new int[26];

        for(int i = 0; i < s.length(); i++){
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }

        for(int i : frequency){
            if(i != 0){
                return false;
            }
        }

        return true;
    }
}