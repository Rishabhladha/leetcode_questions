class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int max =0;

        int[] freq = new int[fruits.length];
        int type = 0;

        for(int r=0;r<fruits.length;r++){

            if(freq[fruits[r]] == 0){
                type++;
            }

            freq[fruits[r]]++;

            while(type>2){
                freq[fruits[l]]--;
                if(freq[fruits[l]] == 0){
                    type--;
                }
                l++;
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}