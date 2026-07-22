class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hashLen = 256;
        int hash[] = new int[hashLen];
        int n = s.length();
        Arrays.fill(hash, -1);

        int l=0;
        int r=0;
        int maxLen =0;
        while(r<n){

            if(hash[s.charAt(r)] >=l){
                l = Math.max(hash[s.charAt(r)]+1,l);
            }
        int len = r-l+1;
        hash[s.charAt(r)]= r;
        r++;
        maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}