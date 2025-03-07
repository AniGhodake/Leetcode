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
    public List<String> binaryTreePaths(TreeNode root) {
         List<String> allPaths = new ArrayList<>();
        dfs(root, "", allPaths);
        return allPaths;
    }
    
    private void dfs(TreeNode node, String path, List<String> allPaths) {
        if (node == null) {
            return;
        }
        
        // Update the path with the current node's value
        path += (path.isEmpty() ? "" : "->") + node.val;
        
        // If the current node is a leaf, add the path to the list of paths
        if (node.left == null && node.right == null) {
            allPaths.add(path);
        } else {
            // Recursively explore left and right subtrees
            dfs(node.left, path, allPaths);
            dfs(node.right, path, allPaths);
        }
    }
}