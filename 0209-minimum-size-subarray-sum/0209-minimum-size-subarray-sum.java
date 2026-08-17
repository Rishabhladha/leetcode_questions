class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int sum =0;
        int min = Integer.MAX_VALUE;

        for(int r=0;r<nums.length;r++){
             sum +=nums[r];

             if(sum >=target){
                min = Math.min(min, r-l+1);
             }

             while(sum>=target){
                sum = sum-nums[l];
                l++;
                if(sum>=target){
                    min=Math.min(min,r-l+1);
                }
             }
    
        }
        return min == Integer.MAX_VALUE ?0:min;
    }
}