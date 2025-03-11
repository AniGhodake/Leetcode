class Solution {
    public int numberOfSubstrings(String s) {
            int[] lastPositions = {-1, -1, -1}; // Track last positions of 'a', 'b', 'c'
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            lastPositions[c - 'a'] = i; // Update the last seen position of the current character
            int min = Math.min(lastPositions[0], Math.min(lastPositions[1], lastPositions[2]));
            if (min != -1) {
                count += min + 1; // Add the number of valid substrings ending at current index
            }
        }
        return count;
    }
}