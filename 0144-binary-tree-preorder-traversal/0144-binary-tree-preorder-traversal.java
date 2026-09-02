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
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> t=new ArrayList<>();
        preorder(t,root);
        return t;
    }
    void preorder(List<Integer> t,TreeNode root){
        if(root==null){
            return;
        }
        t.add(root.val);
        preorder(t,root.left);
        preorder(t,root.right);
        
    }
}