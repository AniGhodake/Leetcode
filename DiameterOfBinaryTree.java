**
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
    private int D = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       
        height(root);
        return D;
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftD = height(root.left);
        int rightD = height(root.right);

        D = Math.max(D, leftD + rightD);
        return Math.max(leftD , rightD) + 1;

    }
}