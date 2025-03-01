class Solution {
    public int[] applyOperations(int[] nums) {
         int n = nums.length;
        
        // Apply operations
        for (int i = 0; i < n - 1; ++i) {
            if (nums[i] == nums[i + 1]) {
                nums[i] <<= 1; // Same as nums[i] = nums[i] * 2
                nums[i + 1] = 0;
            }
        }
        
        // Shift zeros to the end
        int[] result = new int[n];
        int index = 0; // Index for non-zero elements
        for (int num : nums) {
            if (num > 0) {
                result[index++] = num;
            }
        }
        
        return result;
    }
}