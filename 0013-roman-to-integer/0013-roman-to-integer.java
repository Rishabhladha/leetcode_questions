class Solution {
    public int romanToInt(String s) {
        int sum =0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            int value = proceed(ch);
            if(i<s.length()-1 && value<proceed(s.charAt(i+1))){
                sum = sum - value;
            }else{
                sum = sum +value;
            }
        }
        return sum;
    }
    public int proceed(char ch){
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;

        return 1000;
    }
}