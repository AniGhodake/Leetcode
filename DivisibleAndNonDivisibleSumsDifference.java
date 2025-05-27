class Solution {
    public int differenceOfSums(int n, int m) {
        // int sum1 = 0;
        // int sum2 = 0;

        // for(int i = 1; i <= n; i++){
        //     if((i % m) == 0){
        //         sum1 = sum1 + i;
        //     }
        // }

        // for(int i = 1; i <= n; i++){       // USING 2 LOOPS
        //     if((i % m) != 0){
        //         sum2 = sum2 + i;
        //     }
        // }

        // int ans = sum2 - sum1;
        // return ans;




                                            // USING 1 LOOP
        // int divisible = 0;
        // int notDivisible = 0;

        // for (int i = 1; i <= n; i++) {
        //     if (i % m == 0) {
        //         divisible += i;
        //     } else {
        //         notDivisible += i;
        //     }
        // }

        // return notDivisible - divisible;


         int totalSum = n * (n + 1) / 2;

        int count = n / m; // how many numbers divisible by m
        int divisibleSum = m * count * (count + 1) / 2;

        return totalSum - 2 * divisibleSum;


        
    }
}