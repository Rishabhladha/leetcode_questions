class Solution {
    public int myAtoi(String s) {

        String ne = s.trim();

        if(ne.length() == 0){
            return 0;
        }

        long num = 0;
        int sign = 1;
        int i = 0;

        // Handle sign
        if(ne.charAt(0) == '-'){
            sign = -1;
            i++;
        }
        else if(ne.charAt(0) == '+'){
            i++;
        }

        for(; i < ne.length(); i++){

            char ch = ne.charAt(i);

            if(Character.isDigit(ch)){

                int digit = ch - '0';

                num = num * 10 + digit;

                // Overflow check
                if(sign == 1 && num > Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }

                if(sign == -1 && (-num) < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }

            }else{
                break;
            }
        }

        return (int)(sign * num);
    }
}