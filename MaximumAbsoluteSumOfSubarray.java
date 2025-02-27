class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // int maxSum = 0;
        // int minSum = 0;
        // int totalSum = 0;

        // for(int num : nums){
        //     maxSum = Math.max(0, maxSum + num);          KADANE ALGORITHM
        //     minSum = Math.min(0, minSum + num);

        //     totalSum = Math.max(totalSum, Math.max(maxSum, -minSum));
        // }
        // return totalSum;

        int maxSum = 0;
        int minSum = 0;
        int prefixSum = 0;
        for(int num : nums){
            prefixSum += num;
            maxSum = Math.max(maxSum,prefixSum);  // PREFIX SUM METHOD
            minSum = Math.min(minSum,prefixSum);
        }
        return maxSum - minSum;
    }
}