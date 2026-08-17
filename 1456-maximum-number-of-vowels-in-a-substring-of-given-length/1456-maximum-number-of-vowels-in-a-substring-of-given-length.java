class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int count =0;
        int max = Integer.MIN_VALUE;
        for(int r=0;r<s.length();r++){
            if(isVowel(s.charAt(r))){
                count++;
            }

            if(r-l+1 >k){
                if(isVowel(s.charAt(l))){
                    count--;
                }
                l++;
            }

            if(r-l+1 == k){
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public boolean isVowel(char s){
        if(s=='a' || s=='e' ||s=='i' ||
        s=='o' ||s=='u' ){
            return true;
        }else{
            return false;
        }
    }
}