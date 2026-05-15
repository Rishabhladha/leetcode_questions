class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
       
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char sh = t.charAt(i);
           
            if(map.getOrDefault(sh,0)>0){
                map.put(sh, map.get(sh)-1);
            }else{
                return false;
            }
        }
        return true;
    }
}