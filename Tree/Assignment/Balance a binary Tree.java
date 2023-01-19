class Solution {
    private List<TreeNode> arr=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return arrtoBST(0,arr.size()-1);
    }

    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        arr.add(root);
        inorder(root.right);
    }

    private TreeNode arrtoBST(int start, int end){
        if(start > end) return null;
        int mid=(start+end)/2;
        TreeNode root=arr.get(mid);
        root.left=arrtoBST(start,mid-1);
        root.right=arrtoBST(mid+1,end);
        return root;
    }
}
