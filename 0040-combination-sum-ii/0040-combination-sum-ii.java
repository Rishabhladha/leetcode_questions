class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        findCombination(0, target, candidates, ans, new ArrayList<>());

        return ans;
    }

    public void findCombination(int start, int target, int[] arr,
                                List<List<Integer>> ans,
                                List<Integer> curr) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] > target) {
                break;
            }

            curr.add(arr[i]);

            findCombination(i + 1, target - arr[i], arr, ans, curr);

            curr.remove(curr.size() - 1);
        }
    }
}