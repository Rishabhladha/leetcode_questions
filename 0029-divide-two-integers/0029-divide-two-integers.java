class Solution {
    public int divide(int dividend, int divisor) {
        
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend<0) ^ (divisor<0);

        long ans =0;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        while(a>=b){
            long temp = b;
            long multiple = 1;

            while((temp<<1)<=a){
                temp <<=1;
                multiple <<=1;
            }

            a -= temp;
            ans +=multiple;
        }

        if(negative){
            ans = -ans;
        }

            return (int)ans;
    }
}