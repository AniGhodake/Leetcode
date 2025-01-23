class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // for(int i = 0; i< nums.length; i++){
        //     if(nums[i] != i){
        //         return i;                               //METHOD 1 WITH 5MS
        //     }
        // }
        // return nums.length;

        int ans = 0;
        for(int i = 0; i< nums.length; i++){
            ans = ans ^ nums[i];
        }                                                  // METHOD 2 WITH 0MS

        for(int i = 0; i <= nums.length; i++){
            ans = ans ^ i;
        }

        return ans;
    }
}