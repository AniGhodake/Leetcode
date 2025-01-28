class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();

        int l = 0;
        int h = arr.length-1;

        while(h-l >= k){
            if(x-arr[l] > arr[h]-x){
                l++;
            }
            else{
                h--;
            }
        }
        for(int i = l; i <= h; i++){
            ans.add(arr[i]);
        }

        return ans;
    }
}