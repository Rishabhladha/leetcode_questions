class Solution {
    public boolean isValid(String s) {
        while(s.length() !=0){
            String prev =s;
           s= s.replace("()","");
           s= s.replace("[]","");
           s= s.replace("{}","");
            
            if(prev==s){
                break;
            }
        }
        return s.length()==0;
    }
}