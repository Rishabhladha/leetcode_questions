class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
    }

    //simply ye kiya he ki subarray smaller than goal- subaray smaller than goal-1
    // will give me the total no of subarray == goal

    public int atMost(int[] nums, int goal){
        if(goal<0){
            return 0;
        }

        int l=0;
        int count=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];

            while(sum>goal){
                sum = sum-nums[l];
                l++;
            }
            count +=r-l+1;
        }
        return count;
    }
}