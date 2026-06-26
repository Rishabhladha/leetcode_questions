class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        find(0,nums,ans,curr);
        return ans;


    }

    public void find(int index, int[] nums, List<List<Integer>> ans, List<Integer> curr){

        // if(index==nums.length){
        //     ans.add(new ArrayList<>(curr));
        //     return;
        // }

        // curr.add(nums[index]);
        // find(index+1,nums,ans,curr);
        // curr.remove(curr.size()-1);
        // find(index+1,nums,ans,curr);

        ans.add(new ArrayList<>(curr));

    for(int i = index; i < nums.length; i++) {
        curr.add(nums[i]);
        find(i + 1, nums, ans, curr);
        curr.remove(curr.size() - 1);
    }

    }
}