class Solution {

    static boolean isPossibleSol(int nums[], int k, int n, int sol){
        int pagesum = 0;
        int count = 1;
        for(int i = 0; i < n; i++){
            if(nums[i] > sol){
                return false;
            }
            if(pagesum + nums[i] > sol){
                count++;
                pagesum = nums[i];
                if(count > k){
                    return false;
                }
            }
            else{
                pagesum = pagesum + nums[i];
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int ans = -1;
        if(n < k){
            return -1;
        }

        int start = 0;
        int end = 0;
        for(int i = 0; i < n; i++){
            end = end + nums[i];
        }

        while(start <= end){
            int mid = (start + end) >> 1;
            if(isPossibleSol(nums,k,n,mid)){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}