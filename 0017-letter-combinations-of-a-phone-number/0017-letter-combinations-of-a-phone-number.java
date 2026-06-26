class Solution {

    String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String>ans = new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }

        backtrack(0,digits,"",ans);
        return ans;

    }

    public void backtrack(int index,String digits, String curr, List<String> ans){

        if(index==digits.length()){
            ans.add(curr);
            return;
        }

        String letter= map[digits.charAt(index)-'0'];

        for(int i=0;i<letter.length();i++){

            backtrack(index+1,digits,curr+letter.charAt(i),ans);
        }
    }
}