class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        // Store the indices where characters differ
        int[] diffIndices = new int[2];
        int count = 0;

        // Iterate through both strings to find differing indices
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count < 2) {
                    diffIndices[count] = i; // Store the index of the difference
                }
                count++;
            }
            // If more than two differences, return false
            if (count > 2) {
                return false;
            }
        }

        // If exactly two differences, check if swapping makes them equal
        if (count == 2) {
            char s1FirstDiff = s1.charAt(diffIndices[0]);
            char s1SecondDiff = s1.charAt(diffIndices[1]);
            char s2FirstDiff = s2.charAt(diffIndices[0]);
            char s2SecondDiff = s2.charAt(diffIndices[1]);

            return (s1FirstDiff == s2SecondDiff && s1SecondDiff == s2FirstDiff);
        }

        // If there is only one difference, return false
        return false;
    }
}