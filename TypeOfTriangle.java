class Solution {
    public String triangleType(int[] nums) {
        // if(nums[0] >= nums[1] + nums[2] || nums[1] >= nums[0] + nums[2] || nums[2] >= nums[1] + nums[0]){
        //     return "none";
        // }
        // if(nums[0] == nums[1] && nums[1] == nums[2]){
        //     return "equilateral";
        // }
        // else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]){
        //     return "isosceles";
        // }
        // else{
        //     return "scalene";
        // }


         Arrays.sort(nums);  // sort sides for easier triangle check

        // Triangle Inequality Theorem: sum of two smaller sides > largest side
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        }

        // Check triangle type
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        } else if (nums[0] == nums[1] || nums[1] == nums[2]) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}