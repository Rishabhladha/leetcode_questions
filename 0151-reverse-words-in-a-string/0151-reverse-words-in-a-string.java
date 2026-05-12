class Solution {
    public String reverseWords(String s) {
        String ne = s.trim();
        int start = ne.length();
        StringBuilder sb = new StringBuilder();
        for(int i=ne.length()-1;i>=0;i--){
            if(ne.charAt(i)==' '){
                sb.append(ne.substring(i+1, start));
                sb.append(' ');
               
               while(i>=0 && ne.charAt(i)==' '){
                i--;
               }
               start=i+1;
            }

            if(i==0){
                sb.append(ne.substring(i,start));
            }
            
        }
        return sb.toString();
    }
}