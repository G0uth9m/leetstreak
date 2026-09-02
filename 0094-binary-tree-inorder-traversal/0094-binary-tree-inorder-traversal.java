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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> t=new ArrayList<>();
         inorder(t,root);
         return t;
    }
 void inorder(List<Integer> t,TreeNode root){
    if(root==null){
        return;
    }
    inorder(t,root.left);
    t.add(root.val);
    inorder(t,root.right);
}
}
