class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int left =0;
        int count=0;
        int max =0;
        for(int right= 0; right<nums.length; right++){
            if(nums[right] ==1){
                count++;
            }else{
                count=0;
                // left = right;
            }
             max = Math.max(max, count);
        }
        return max;
    }
}