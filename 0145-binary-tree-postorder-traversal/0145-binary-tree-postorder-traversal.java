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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        TreeNode current = root;
        if(root == null) return result;
        s1.push(current);
        while(!s1.isEmpty()){
            current = s1.pop();
            s2.push(current.val);

            if(current.left !=null){
                s1.push(current.left);
            }

            if(current.right != null){
                s1.push(current.right);
            }
        }
        while(!s2.isEmpty()){
            result.add(s2.pop());
        }
        return result;
    }
}


 // the recursive approch
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         postorder(root, ans);
//         return ans;
//     }

//     public void postorder(TreeNode root, List<Integer> ans){
//         if(root == null){
//             return;
//         }

//         postorder(root.left, ans);
//         postorder(root.right, ans);

//         ans.add(root.val);
//     }
// }