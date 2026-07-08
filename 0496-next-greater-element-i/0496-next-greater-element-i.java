class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int target = nums1[i];
            int nextGreater = -1;

            // Find target in nums2
            int j;
            for (j = 0; j < nums2.length; j++) {
                if (nums2[j] == target) {
                    break;
                }
            }

            // Search to the right
            for (j = j + 1; j < nums2.length; j++) {
                if (nums2[j] > target) {
                    nextGreater = nums2[j];
                    break;
                }
            }

            ans[i] = nextGreater;
        }

        return ans;
    }
}