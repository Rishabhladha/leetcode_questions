class Solution {
    public int characterReplacement(String s, int k) {
        int l =0;
        int maxLen =0;
        int maxFreq = 0;
        int[] freq = new int[26];

        for(int r=0; r<s.length(); r++){
            freq[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq,  freq[s.charAt(r)-'A']);
            
            while((r-l+1) - maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);

        }
        return maxLen;
    }
}
//brute force approch given below

// class Solution {
//     public int characterReplacement(String s, int k) {
        
//          int maxLen=0;

//         for(int i=0;i<s.length();i++){
//             int hash[] = new int[26];
//             int maxFreq =0;

//             for(int j=i;j<s.length();j++){

//                 hash[s.charAt(j)-'A']++;
//                 maxFreq = Math.max(maxFreq, hash[s.charAt(j)-'A']);
//                 int window = j-i+1;
//                 int change = window-maxFreq;
//                 if(change<=k){
//                    maxLen = Math.max(maxLen, j-i+1);
//                 }else{
//                     break;
//                 }
//             }
//         }
//         return maxLen;
//     }
// }