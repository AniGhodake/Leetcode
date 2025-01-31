class Solution {
    public boolean validPalindrome(String s) {
        return isValid(s, 0, s.length()-1, 1);
    }

    boolean isValid(String s, int start, int end, int removals) {
        if (start >= end) {
            return true; // Base case: valid palindrome
        }

        if (s.charAt(start) == s.charAt(end)) {
            return isValid(s, start + 1, end - 1, removals);
        }

        if (removals > 0) {
            // Try skipping the character at `start` or `end` and reduce removals count
            return isValid(s, start + 1, end, removals - 1) || isValid(s, start, end - 1, removals - 1);
        }

        return false; // No more removals allowed, and it's not a palindrome
    }
}