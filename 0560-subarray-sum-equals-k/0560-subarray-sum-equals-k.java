class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            //case1
            if(sum==k){
                count++;
            }
            //case2
            int needed = sum-k;
            if(map.containsKey(needed)){
                count += map.get(needed);
            }

             map.put(sum, map.getOrDefault(sum,0)+1);

        }
        return count;
    }
}
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         map.put(0, 1);  // base case
        
//         int count = 0;
//         int sum = 0;
        
//         for(int i = 0; i < nums.length; i++){
//             sum += nums[i];
            
//             int needed = sum - k;
            
//             if(map.containsKey(needed)){
//                 count += map.get(needed);
//             }
            
//             map.put(sum, map.getOrDefault(sum, 0) + 1);
//         }
        
//         return count;
//     }
// }