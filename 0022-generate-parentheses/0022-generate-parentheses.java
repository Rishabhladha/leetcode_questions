class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();

        int count1 =0;
        int count2=0;
        solve(n,"",ans,count1,count2);
        return ans;
    }
    public void solve(int n, String curr, ArrayList<String> ans, int count1, int count2){
        
        if(curr.length()==n*2){
            if(curr.charAt(0)=='(' && curr.charAt(curr.length()-1)==')'){
                ans.add(curr);
                return;
            }
            return;
        }
        if(count1<n){
        solve(n,curr+"(",ans,count1+1,count2);
        }
        if(count2<count1){
        solve(n,curr+")",ans,count1,count2+1);
        }
    }
}