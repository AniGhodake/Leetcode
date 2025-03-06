class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int n = grid.length;
        int nSquared = n * n;

        // Array to count occurrences of each number
        int[] count = new int[nSquared + 1];
        
        // Count the occurrences of each number in the grid
        for (int[] row : grid) {
            for (int num : row) {
                count[num]++;
            }
        }

        int repeated = -1, missing = -1;

        // Identify the repeated and missing numbers
        for (int i = 1; i <= nSquared; i++) {
            if (count[i] == 2) {
                repeated = i;
            } else if (count[i] == 0) {
                missing = i;
            }
            
            // Break early if both are found
            if (repeated != -1 && missing != -1) {
                break;
            }
        }

        return new int[]{repeated, missing};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[][] grid1 = {{1, 3}, {2, 2}};
        int[] result1 = solution.findMissingAndRepeatedValues(grid1);
        System.out.println("Example 1 Output: [" + result1[0] + ", " + result1[1] + "]");

        // Example 2
        int[][] grid2 = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};
        int[] result2 = solution.findMissingAndRepeatedValues(grid2);
        System.out.println("Example 2 Output: [" + result2[0] + ", " + result2[1] + "]"); 
    }
}