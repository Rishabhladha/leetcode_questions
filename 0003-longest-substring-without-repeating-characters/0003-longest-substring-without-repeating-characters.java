class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        for(int i=0;i<s.length();i++){
        int arr[] = new int[256];         
           int count =0;
            for(int j=i;j<s.length();j++){         
                char ch = s.charAt(j);
                int ind = ch;
                if(arr[ind]==1){
                    break;
                }else{
                    arr[ind]++;
                    count++;
                }
                 max = Math.max(max,count);
            }
        }
        return max;
    }
}