class Solution {
    public int minOperations(int[] nums) {
         int count = 0;
        int n = nums.length;
        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                // Flip nums[i], nums[i+1], nums[i+2]
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                count++;
            }
        }
        // Check the last two elements
        for (int i = n - 2; i < n; i++) {
            if (nums[i] == 0) {
                return -1;
            }
        }
        return count;
    }
}