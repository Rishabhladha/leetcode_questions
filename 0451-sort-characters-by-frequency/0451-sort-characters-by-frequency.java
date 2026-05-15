class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        int max =0;
        for(int freq: map.values()){
            max = Math.max(max, freq);
        }
        for(int freq = max; freq>=1;freq--){
            for(char ch : map.keySet()){
                if(map.get(ch)==freq){
                    for(int i=0;i<freq;i++){
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}