class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int max =0;
        int count =0;
        for(int val : map.values()){
            if(val>max){
                max=val;
                count=0;
            }
            if(val == max){
                count++;
            }
        }
        return max*count;
    }
}