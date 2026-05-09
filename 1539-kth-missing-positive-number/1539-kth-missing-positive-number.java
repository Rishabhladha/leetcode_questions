class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count =1;
        int time= 0;
        int low=0;
        int high= arr.length;
        int num=0;
       while(low<high){
            if(arr[low]==count){
                count++;
                low++;
            }else{
                 num= count;
                count++;
                time++;
                if(time == k){
                    return num;
                }
            }
        }
        int fin = k-time;

        
        return (arr[high-1]+fin);
    }
}