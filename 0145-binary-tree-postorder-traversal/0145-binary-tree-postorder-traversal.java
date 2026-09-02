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
        List<Integer> t=new ArrayList<>();
        postorder(t,root);
        return t;
    }
    void postorder(List<Integer> t,TreeNode root){
        if(root==null){
            return;
        }
        postorder(t,root.left);
        postorder(t,root.right);
        t.add(root.val);
    }
}