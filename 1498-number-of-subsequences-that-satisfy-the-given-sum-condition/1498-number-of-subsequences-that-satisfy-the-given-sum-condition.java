class Solution {

    int MOD = 1000000007;

    public int numSubseq(int[] nums, int target) {

        Arrays.sort(nums);

        int n = nums.length;

        int[] pow = new int[n];
        pow[0] = 1;

        for (int i = 1; i < n; i++) {
            pow[i] = (int)((pow[i - 1] * 2L) % MOD);
        }

        int left = 0;
        int right = n - 1;

        long ans = 0;

        while (left <= right) {

            if (nums[left] + nums[right] <= target) {

                ans = (ans + pow[right - left]) % MOD;

                left++;
            } else {
                right--;
            }
        }

        return (int) ans;
    }
}
//this code will not work because time jada lg ra he mod bacha nhi paye ga
// class Solution {
//     int mod = 1000000007;
//     int count=0;
//     public int numSubseq(int[] nums, int target) {
//         List<Integer> ans = new ArrayList<>();
//        solve(0,nums,taget,ans);
//         return count;
//     }

//     public void solve(int index, int[] nums, int target, int ans){

//             if(index == nums.length){
//                 int start = ans.get(0);
//                 int end = ans.get(ans.size()-1);
//                 if(start+end==target){
//                     count++;
//                     return;
//                 }
//             }

//         if(nums[index]<=target){
//             ans.add(nums[index]);
//             solve(index+1,nums,target,ans);
//             ans.remove(ans.size()-1);
//         }
//         solve(index+1,nums,target,ans);
//     }
// }