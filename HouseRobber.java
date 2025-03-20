class Solution {

    // int robber(int n, int nums[],int dp[]){
        // if(n == 0){
        //     return nums[0];
        // }
        // if(n == 1){
        //     return Math.max(nums[0], nums[1]);
        // }
    //     if(dp[n] != -1){      // ------- TOP DOWN APPROACH -----------
    //         return dp[n];
    //     }
    //     return dp[n] = Math.max(nums[n] + robber(n-2, nums,dp), robber(n-1, nums,dp));
    // }

    public int rob(int[] nums) {
        int n = nums.length;

    //     if(n == 1){
    //         return nums[0];  // -------  BOTTOM UP APPROACH ---------
    //     }
    //     if(n == 2){
    //         return Math.max(nums[0], nums[1]);
    //     }
    //     int dp[] = new int[n];
    //     for(int i = 0; i < n; i++){
    //         dp[i] = -1;
    //     }
    //    dp[0] = nums[0];
    //    dp[1] = Math.max(nums[0], nums[1]);
     
    //     for(int i = 2; i < n; i++){
    //         dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
    //     }
    //     return dp[n-1];


        // return robber(n-1,nums,dp);    


        if(n == 1){
            return nums[0];
        }
        if(n == 2){
            return Math.max(nums[0], nums[1]);
        }

        int prev = Math.max(nums[0],nums[1]);
        int prev1 = nums[0];
        int curr = 0;

        for(int i = 2; i < n; i++){
            curr = Math.max(nums[i] + prev1, prev);
            prev1 = prev;
            prev = curr;
        }
        return curr;
    }
}