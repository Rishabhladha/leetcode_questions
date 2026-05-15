class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] freq = new int[26];

        // increase frequency using s
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            freq[ch - 'a']++;
        }

        // decrease frequency using t
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            freq[ch - 'a']--;

            // if frequency becomes negative
            // extra character exists in t
            if(freq[ch - 'a'] < 0){
                return false;
            }
        }

        return true;
    }
}