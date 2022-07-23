class Solution {
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
        
    }
    public TreeNode invert(TreeNode root){
        if(root == null){
             return null;
        }
        
        TreeNode invertLeft = invert(root.left);
        TreeNode invertRight = invert(root.right);
        
        root.right = invertLeft;
        root.left = invertRight;
        
        return root;
    }
}