class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
            findCombination(0,target,candidates,ans,curr);
            return ans;
    }

    public void findCombination(int index, int target, int[] arr, List<List<Integer>> ans, List<Integer> curr){

            if(index==arr.length){
                if(target==0){
                    ans.add(new ArrayList<>(curr));
                }
                return;
            }

            if(arr[index]<=target){
                curr.add(arr[index]);
                findCombination(index,target-arr[index],arr,ans,curr);
                curr.remove(curr.size()-1);
            }

            findCombination(index+1,target,arr,ans,curr);
    }
}