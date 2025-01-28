class Solution {
    public int findPairs(int[] nums, int k) {

        // if(nums == null || nums.length == 0 || k < 0){
        //     return 0;
        // }

        
        // Set<String> set = new HashSet<>();
        // Set<Integer> seen = new HashSet<>();          WORKS WITH 19 MS

        // for (int num : nums) {
        //     if (seen.contains(num - k)) {
        //         set.add((num - k) + "," + num);
        //     }
        //     if (seen.contains(num + k)) {
        //         set.add(num + "," + (num + k));
        //     }
        //     seen.add(num);
        // }

        // return set.size();

           int i=0;
        int j=1;
        int m=0;
        int abs=0;
        Arrays.sort(nums);
        int sum=Integer.MIN_VALUE;
        while(i<nums.length-1 && j<nums.length){
            //abs=Math.abs(nums[i]-nums[j]);
            //System.out.println(abs);
            if( Math.abs(nums[i]-nums[j])==k && (nums[i]+nums[j])!=sum){
                  
                     sum=nums[i]+nums[j];
                       m++;  
                    i++; j++;      
            }
            else if((nums[j]-nums[i])<k){           // WORKS WITH 7 MS
                j++;
            }
			//else case, when diff is greater than k, increase i by 1
			else{
                i++;                   
            }
			//check if i and j are not same to aoid duplicates
            if(i==j) j++;
            }
        
        return m;
    }
}