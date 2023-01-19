class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();

        if(root==null)
        return res;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root); 
        
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> l=new ArrayList<Integer>();

            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);

                l.add(temp.val);
            }
            res.add(l);
        }
        return res;
    }
}
