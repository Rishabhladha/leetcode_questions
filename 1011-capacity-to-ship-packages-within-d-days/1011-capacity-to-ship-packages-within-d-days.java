class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = weights[0];
        int sumation= weights[0];
        for(int i=1;i<n;i++){
            max = Math.max(max, weights[i]);
            sumation +=weights[i]; 
        }

        int low=max;
        int high = sumation;
        while(low<=high){
            int mid = low+(high-low)/2;

            int value = sol(weights, mid);
            if(value<=days){
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
    return low;    
    }

    public int sol(int[] weights, int max){
        int day=1; 
        int load =0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>max){
                day++;
                load= weights[i];
            }else{
                load +=weights[i];
            }
        }
        return day;
    }
}