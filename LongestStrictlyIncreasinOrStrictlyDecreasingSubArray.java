class Solution {
    public int longestMonotonicSubarray(int[] nums) {
           int ans = 1;
        int t = 1;
        // Check for strictly increasing subarrays
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                t++;
                ans = Math.max(ans, t);
            } else {
                t = 1;
            }
        }
        // Reset for checking strictly decreasing subarrays
        t = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                t++;
                ans = Math.max(ans, t);
            } else {
                t = 1;
            }
        }
        return ans; 
    }
}