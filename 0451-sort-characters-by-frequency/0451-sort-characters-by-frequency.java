import java.util.*;

class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        // Count frequency
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        
        StringBuilder sb = new StringBuilder();
        
        // Repeat until map becomes empty
        while(!map.isEmpty()){
            
            char maxChar = ' ';
            int maxFreq = 0;
            
            // Find character with maximum frequency
            for(char ch : map.keySet()){
                
                if(map.get(ch) > maxFreq){
                    maxFreq = map.get(ch);
                    maxChar = ch;
                }
            }
            
            // Add character maxFreq times
            for(int i=0;i<maxFreq;i++){
                sb.append(maxChar);
            }
            
            // Remove used character
            map.remove(maxChar);
        }
        
        return sb.toString();
    }
}