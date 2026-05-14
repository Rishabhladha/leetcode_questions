class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(map.containsKey(sc)){
                if(map.get(sc) != tc){
                    return false;
                }
            }else{
               if(used.contains(tc)){
                return false;
               }
               map.put(sc, tc);
               used.add(tc);
            }

        }
        return true;
    }
}