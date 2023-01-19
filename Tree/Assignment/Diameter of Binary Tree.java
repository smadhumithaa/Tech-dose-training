class Solution {
    int lvl=0;
    public int diameterOfBinaryTree(TreeNode root) {
     pre(root);
     return lvl;
    }
    private int pre(TreeNode root){
        if(root==null) return 0;
        int ld=pre(root.left);
        int lr=pre(root.right);
        lvl=Math.max(lvl,ld+lr);
        return Math.max(ld,lr)+1;
    } 
}
