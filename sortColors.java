class Solution {
    public void sortColors(int[] nums) {
       
        int zero = 0;
        int two = nums.length-1;
        int temp = 0;
        int i = 0;

        while(i<=two){
            if(nums[i] == 0){
                temp = nums[zero];
                nums[zero] = nums[i];
                nums[i] = temp;

                zero++;
                i++;

            }
            else if(nums[i] == 2){
                temp = nums[two];
                nums[two] = nums[i];
                nums[i] = temp;

                two--;

            }
            else{
                i++;
            }
        }      
    }
}