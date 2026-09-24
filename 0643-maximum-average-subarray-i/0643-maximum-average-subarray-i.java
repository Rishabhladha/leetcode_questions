class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;
        double ans = Integer.MIN_VALUE;
        int left = 0;
        for(int right=0; right<nums.length; right++){
             sum = sum+nums[right];

             if(right-left+1>k){
                sum = sum-nums[left];
                left++;
             }

             if(right-left+1 == k){
                 ans = Math.max(sum,ans);
                 ans = ans;
             }
        }
        return ans/k;
    }
}