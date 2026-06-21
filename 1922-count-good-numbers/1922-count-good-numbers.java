class Solution {
      long mod = 1000000007L;

    public int countGoodNumbers(long n) {
      

        long even = power(5, (n+1)/2)%mod;

        long odd = power(4,n/2)%mod;

        long result = (even*odd)%mod;
        return (int)result;
    }

    public long power(long n, long m){

        if(m==0){
            return 1;
        }

        long half = power(n,m/2);

        long result = (half*half)%mod;
        if(m%2==1){
            result = (result*n)%mod;
        }
        return result;

    }
}