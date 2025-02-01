class Solution {
    
    int maxSumArrayHelper(int nums[], int start, int end){
         if(start == end){
            return nums[start];
        }

        int maxLeftBorderSum = Integer.MIN_VALUE;
        int maxRightBorderSum = Integer.MIN_VALUE;
        int mid = start + (end - start) / 2;
       

        int leftMaxSum =  maxSumArrayHelper(nums, start, mid);
        int rightMaxSum = maxSumArrayHelper(nums, mid+1, end);



        int leftBorderSum = 0;
        int rightBorderSum = 0;
        for(int i = mid; i >= start; i--){
            leftBorderSum += nums[i];
            if(leftBorderSum > maxLeftBorderSum){
                maxLeftBorderSum = leftBorderSum;
            }
        }
        for(int i = mid+1; i <= end; i++){
            rightBorderSum += nums[i];
            if(rightBorderSum > maxRightBorderSum){
                maxRightBorderSum = rightBorderSum;
            }
        }

        int crossBorderSum = maxLeftBorderSum + maxRightBorderSum;
       return Math.max(leftMaxSum, Math.max(rightMaxSum, crossBorderSum));
    }
    
    public int maxSubArray(int[] nums) {     
        return maxSumArrayHelper(nums, 0, nums.length -1);
    }
}