class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
      
        if(root==null)
        return res;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int lvl=0;
        while(!q.isEmpty()){
            int n=q.size();
            lvl++;
            List<Integer> lis=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                //q.remove();
               
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                lis.add(temp.val);
            }
            if(lvl%2==0){
                Collections.reverse(lis);
            }
            res.add(lis);
        }
        return res;
    }
}
