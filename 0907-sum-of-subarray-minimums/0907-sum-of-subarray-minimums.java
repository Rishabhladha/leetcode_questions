class Solution {
    //next smaller element
    public int[] findNSE(int[] arr){
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }

            ans[i] = !stack.isEmpty()?stack.peek():n;
            stack.push(i);
        }
        return ans;

    }

    //previous smaller element
    public int[] findPSE(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
        while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
            stack.pop();
        }
        ans[i] = !stack.isEmpty() ? stack.peek():-1;
        stack.push(i);
        }
        return ans;
    }

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int nse[] = findNSE(arr);
        int pse[] = findPSE(arr);

        int mod = 1000000007;
        int sum =0;
        for(int i=0;i<n;i++){
            int right = nse[i]-i;
            int left = i - pse[i];

            long freq = ((long)right*left*arr[i])%mod;
            sum = (int) (freq+sum)%mod;
        }
        return sum;
    }
}