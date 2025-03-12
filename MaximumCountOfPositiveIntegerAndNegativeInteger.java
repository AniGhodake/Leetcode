class Solution {
    public int maximumCount(int[] nums) {
        //  int posCount = 0;
        // int negCount = 0;

        // // Count positive and negative integers
        // for (int num : nums) {
        //     if (num > 0) {
        //         posCount++;
        //     } else if (num < 0) {
        //         negCount++;
        //     }
        // }

        // // Return the maximum count
        // return Math.max(posCount, negCount);

            int n = nums.length;

        // Find the first positive number's index
        int posIndex = lowerBound(nums, 1);
        
        // Find the first zero (or last negative + 1)
        int negIndex = lowerBound(nums, 0);
        
        int posCount = n - posIndex; // Numbers after posIndex are positive
        int negCount = negIndex; // Numbers before negIndex are negative
        
        return Math.max(posCount, negCount);
    }

    // Binary Search to find the first index where target can be inserted
    private int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}