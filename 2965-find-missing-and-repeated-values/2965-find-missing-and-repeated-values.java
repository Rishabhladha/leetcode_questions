class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = grid.length;
        int m = grid[0].length;
        int count=0;
        int []result = new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0)+1);
                count++;
            }
        }

        int mis =0;
        int rep =0;

        for(int i=1;i<count+1;i++){
            if(!map.containsKey(i)){
                mis=i;
            }else{
                int value = map.get(i);
                if(value>1){
                    rep =i;
                }
            }
        }
        result[0]=rep;
        result[1] = mis;
        return result;

    }
}