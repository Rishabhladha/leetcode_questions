class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        for(int i=0;i<s.length();i++){
        String ne = s.substring(s.length()-1-i,s.length()) + s.substring(0,s.length()-1-i);
            if(ne.equals(goal)){
                return true;
            }
        }
        return false;
    }
}