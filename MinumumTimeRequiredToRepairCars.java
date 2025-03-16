class Solution {
    public long repairCars(int[] ranks, int cars) {
        int maxRank = 0;
        for(int rank : ranks){
            maxRank = Math.max(maxRank,rank);
        }

        long left = 0;
        long right = (long)maxRank * cars * cars;

       while (left < right) {
            long mid = left + (right - left) / 2;
            long totalCarsRepaired = 0; // Fix variable name and initialize inside loop

            for (int rank : ranks) {
                totalCarsRepaired += (long) Math.sqrt(mid / rank);
            }

            if (totalCarsRepaired >= cars) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
         return left;

       
    }
}