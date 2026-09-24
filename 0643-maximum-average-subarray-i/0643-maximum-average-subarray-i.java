class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int r=0;
        int n = nums.length;
        double avg =0;
        double max =Integer.MIN_VALUE;
        while(r<n){
            avg +=nums[r];

            if(r-l+1>k){
                avg = avg-nums[l];
                l++;
            }
            if(r-l+1==k){
                max = Math.max(max, avg/k);
            }
            r++;
        }
        return max;
    }
}

