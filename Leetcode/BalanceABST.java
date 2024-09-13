class Solution {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        makeAl(root,al);
        int n = al.size();
        return makeATree(0,n-1,root,al);
    }
    public void makeAl(TreeNode root,ArrayList<Integer> al){
        if(root == null){
            return;
        }
        makeAl(root.left,al);
        al.add(root.val);
        makeAl(root.right,al);
    }
    public TreeNode makeATree(int left,int right,TreeNode ans,ArrayList<Integer> al){
            if(left > right){
                return null;
            }
        
            int mid = (left + right) / 2;
            TreeNode node = new TreeNode(al.get(mid));
            node.left = makeATree(left,mid-1,node,al);
            node.right = makeATree(mid+1,right,node,al);
            return node;
    }
}
