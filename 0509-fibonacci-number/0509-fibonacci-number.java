/*class Solution {
    public int fib(int n) {

        int ft = 0, st = 1;

        for(int i = 1; i <= n; i++){
            int tt = ft + st;
            ft = st;
            st = tt;
        }

        return ft;
    }
}*/
class Solution {
    public int fib(int n) {
        if(n<=0) return 0;
        if(n==1) return 1;
        return (fib(n-1) + fib(n-2));

    }
}