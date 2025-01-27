class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int rem = 0;
        int ans = 0;

        while(x > 0){
            rem = x % 10;
            ans = ans * 10 + rem;
            x = x / 10;
        }
        
        if(ans == y){
            return true;
        }
        else{
            return false;
        }
    }
}