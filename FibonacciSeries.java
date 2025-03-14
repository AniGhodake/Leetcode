class Solution {
    public int fib(int n) {

        // if(n == 0) return n;
        // if(n == 1) return n;
        // int prev = 1;
        // int prev2 = 0;
        // int ans = 0;
        // for(int i = 2; i <= n; i++){    0 MILI SECONDS RUNTIME
        //     ans = prev + prev2;
        //     prev2 = prev;
        //     prev = ans;
        // }
        // return ans;


        // if(n <= 1){
        //     return n;
        // }
        // return fib(n-1) + fib(n-2);         8 MILI SECONDS RUNTIME


        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            arr.add(-1);
        }

        return fibo(n, arr);
    }
    public int fibo(int n, ArrayList<Integer>arr){
        if(n <= 1){
            return n;
        }

        if(arr.get(n) != -1){
            return arr.get(n);
        }

        int result = fibo(n-1,arr) + fibo(n-2,arr);
        arr.set(n,result);

        return result;
    }
}