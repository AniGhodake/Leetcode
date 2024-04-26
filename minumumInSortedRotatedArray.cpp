//        153. Find Minimum in Rotated Sorted Array             LEETCODE
#include<vector>
class Solution {
public:
    int findMin(vector<int>& nums) {
        int n = nums.size()-1;
        int s = 0, e = n;
        int ans = nums[0];
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]>=nums[0]){
                s = mid +1;
            }
            else{
                ans = nums[mid];
                e = mid -1;
            }
        }
        return ans;

    }
};