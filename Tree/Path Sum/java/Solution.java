class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        // Check if it is a leaf
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        targetSum = targetSum - root.val;

        return hasPathSum(root.left, targetSum) ||
               hasPathSum(root.right, targetSum);
    }
}