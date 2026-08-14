class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int arr[] = new int[256];
        int left =0;
        int right =0;
        int n = s.length();
        int max =0;
        while(right<n){
            char ch = s.charAt(right);
            arr[ch]++;
            if(arr[ch]>1){
                while(arr[ch]>1){
                    char ne = s.charAt(left);
                    arr[ne]--;
                    left++;
                }
            }
            max = Math.max(max, right -left +1);
            right++;
        }

    return max;
    }
}