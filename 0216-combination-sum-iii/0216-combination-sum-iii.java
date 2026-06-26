class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
            find(0,k,n,arr,ans,curr);
            return ans;

    }

    public void find(int index,int k, int target, int[] arr, List<List<Integer>> ans, List<Integer> curr){

           if(curr.size()==k){
            if(target==0){
                ans.add(new ArrayList<>(curr));
                return;
            }
            return;
           }
           
           if(index >= arr.length){
    return;
}


            if(arr[index]<=target){
                curr.add(arr[index]);
                find(index+1,k,target-arr[index],arr,ans,curr);
                curr.remove(curr.size()-1);
            }
            find(index+1,k,target,arr,ans,curr);
    }
}