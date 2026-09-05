/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> first = new LinkedList<>();
        Queue<TreeNode> second = new LinkedList<>();

        first.add(p);
        second.add(q);

        while (!first.isEmpty() && !second.isEmpty()) {

            TreeNode cur1 = first.remove();
            TreeNode cur2 = second.remove();

            // Both are null
            if (cur1 == null && cur2 == null) {
                continue;
            }

            // Only one is null
            if (cur1 == null || cur2 == null) {
                return false;
            }

            // Values are different
            if (cur1.val != cur2.val) {
                return false;
            }

            // Add left children
            first.add(cur1.left);
            second.add(cur2.left);

            // Add right children
            first.add(cur1.right);
            second.add(cur2.right);
        }

        return first.isEmpty() && second.isEmpty();
    }
}