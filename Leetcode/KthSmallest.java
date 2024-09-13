class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        
        tn(root,al);
       return al.get(k-1); 
    }
    public void tn(TreeNode root,ArrayList<Integer>al){
        if(root==null)return;
        tn(root.left,al);
        al.add(root.val);
        tn(root.right,al);
    }
}
