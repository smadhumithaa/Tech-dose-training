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
    public boolean isCousins(TreeNode root, int x, int y) {
        return lvl(root,x,y);
    }
    private boolean lvl(TreeNode root, int x,int y){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int l=0;
        int p1=root.val;
        int p2=root.val;
        int l1=root.val;
        int l2=root.val;
        int p=0;
        while(!q.isEmpty())
        {
            l++;
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                if(temp.val==x){
                l1=l;
                p1=p;
                }
                if(temp.val==y){
                     p2=p;
                     l2=l;
                }
               
                p=temp.val;
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        System.out.print(l1+" "+l2+" "+p1+" "+p2);
        if(l1==l2 && p1!=p2)
        return true;

        return false;
    }
}
