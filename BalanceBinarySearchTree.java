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
    void inOrder(TreeNode root, ArrayList<Integer>in){
        if(root == null){
            return;
        }
        inOrder(root.left,in);
        in.add(root.val);
        inOrder(root.right,in);
    }

    TreeNode buildBalanceBST(ArrayList<Integer>in, int start, int end){
        if(start > end){
            return null;
        }
        int mid = start + (end -start)/2;
        TreeNode root = new TreeNode(in.get(mid));
        root.left = buildBalanceBST(in, start, mid-1);
        root.right = buildBalanceBST(in, mid+1, end);
        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> in = new ArrayList<>();
        inOrder(root,in);

        return buildBalanceBST(in, 0, in.size()-1);
    }
}