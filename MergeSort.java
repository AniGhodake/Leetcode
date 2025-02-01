class Solution {
    public int[] sortArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return nums;
        }

        mergeSort(nums, 0, (nums.length)-1);
        return nums;
    }


    void mergeSort(int nums[], int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;

            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }

    void merge(int nums[], int left, int mid, int right){
        int n1 = mid - left + 1;  // left halve size
        int n2 = right - mid;     // right halve size

        int leftarr[] = new int[n1];
        int rightarr[] = new int[n2];

        for(int i = 0; i < n1; i++){
            leftarr[i] = nums[left + i];
        }

        for(int j = 0; j < n2; j++){
            rightarr[j] = nums[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < n1 && j < n2){
            if(leftarr[i] <= rightarr[j]){
                nums[k++] = leftarr[i++];
            }
            else{
                nums[k++] = rightarr[j++];
            }
        }

        while(i < n1){
            nums[k++] = leftarr[i++];
        }
        while(j < n2){
            nums[k++] = rightarr[j++];
        }
    }
}