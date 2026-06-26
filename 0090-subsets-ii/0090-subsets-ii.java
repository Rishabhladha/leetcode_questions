class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        find(0,nums,ans,curr);
        return ans;


    }

    public void find(int start, int[]nums, List<List<Integer>> ans, List<Integer>curr){

        ans.add(new ArrayList<>(curr));


        for(int i=start;i<nums.length;i++){
             if(i > start && nums[i] == nums[i - 1]) {
        continue;
    }
            curr.add(nums[i]);
            find(i+1,nums,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}