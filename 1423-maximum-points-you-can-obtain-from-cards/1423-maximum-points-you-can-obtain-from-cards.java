class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=0;
        int n = cardPoints.length;
        int sum =0;
        int totalSum =0;
        int min =Integer.MAX_VALUE;
        for(int r=0;r<cardPoints.length;r++){
            sum += cardPoints[r];
            totalSum +=cardPoints[r];

            if(r-l+1> n-k){
                sum = sum-cardPoints[l];
                l++;
            }

            if(r-l+1 == n-k){
                min = Math.min(min, sum);   
            }
        }
        int total = totalSum-min;
        return total;
    }
}




// this is the brute force 
// class Solution {
//     public int maxScore(int[] cardPoints, int k) {
//         return solve(cardPoints,0,cardPoints.length-1,k);
//     }

//     public int solve(int [] cardPoints, int l, int r, int k){

//         if(k == 0){
//             return 0;
//         }

//         int left = cardPoints[l] + solve(cardPoints, l+1, r, k-1);
//         int right = cardPoints[r]+ solve(cardPoints, l, r-1, k-1);

//         return Math.max(left,right);
//     }
// }