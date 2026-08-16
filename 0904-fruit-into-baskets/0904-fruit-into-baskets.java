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
// the below one is a little beterr approch

// class Solution {
//     public int totalFruit(int[] fruits) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int left = 0, ans = 0;

//         for (int right = 0; right < fruits.length; right++) {
//             map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

//             while (map.size() > 2) {
//                 map.put(fruits[left], map.get(fruits[left]) - 1);

//                 if (map.get(fruits[left]) == 0)
//                     map.remove(fruits[left]);

//                 left++;
//             }

//             ans = Math.max(ans, right - left + 1);
//         }

//         return ans;
//     }
// }