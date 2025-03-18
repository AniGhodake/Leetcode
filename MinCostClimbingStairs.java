class Solution {

    // int ways(int n, int cost[]){
    //     if(n <= 1){
    //         return 0;      ----------TIME LIMIT EXCEEDED------
    //     }

    //     return Math.min(cost[n-1]+ ways(n-1,cost), cost[n-2] + ways(n-2, cost));
    // }

    int ways(int n, int cost[], int dp[]){
     if(n <= 1) {
            return 0; // Base case: No cost to reach the top
        }
        
        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = Math.min(cost[n - 1] + ways(n - 1, cost, dp), cost[n - 2] + ways(n - 2, cost, dp));
        return dp[n];
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        
        return ways(n, cost, dp);
    }
}