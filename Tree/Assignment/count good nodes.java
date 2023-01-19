class Solution {
    int c=0;
    public int goodNodes(TreeNode root) {
        help(root,root.val);
        return c;
    }
    private void help(TreeNode root, int max){
        if(root!=null){
            if(root.val>=max)
              c++;
            help(root.left, Math.max(root.val,max));
            help(root.right, Math.max(max, root.val));
            
        }
    }
}
