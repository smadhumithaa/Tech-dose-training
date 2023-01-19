class Solution {
    public List<Integer> l=new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        levelOrder(root);
       
        return l;
    }

    private void levelOrder(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        que.add(root);
        while(!que.isEmpty()){
            int n=que.size();
            for(int i=0;i<n;i++){
                TreeNode temp=que.peek();
                que.remove();
            if(i==n-1){
                l.add(temp.val);
            }
            if(temp.left!=null){
                que.add(temp.left);
            }
            if(temp.right!=null){
                que.add(temp.right);
            }
        }
        }
    }
}
