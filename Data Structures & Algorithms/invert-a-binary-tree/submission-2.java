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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode lt=invertTree(root.left);
        TreeNode rt=invertTree(root.right);

        if(root.left!=null && root.right!=null){
            root.left=rt;
            root.right=lt;
        }

        if(root.left==null || root.right==null){
           TreeNode tmp=lt;
           root.left=rt;
           root.right=tmp;
        }

        return root;
    }
}
