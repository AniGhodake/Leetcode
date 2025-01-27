

class Solution {
    public int reverse(int x) {

        // int rem = 0;
        // int ans = 0;

        // while (x != 0) {
        //     rem = x % 10;
            
           
        //     if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) {
        //         return 0;
        //     }
        //     if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) {
        //         return 0;
        //     }
            
        //     ans = ans * 10 + rem;             // WORKS FINE BUT COMPLEX
        //     x = x / 10;
        // }
        // return ans;
        long rev=0;
        while(x!=0){
            int d=x%10;
            x=x/10;
            rev=rev*10+d;
        }
        return((rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE)? 0 :(int)rev);
    }
}