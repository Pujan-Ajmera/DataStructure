class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> al = new ArrayList<>();
        fun(root1,al);
        fun(root2,al);
        Collections.sort(al);
        return al;
    }
    
    public void fun(TreeNode t,List al){
        if(t == null)return;
        al.add(t.val);
        fun(t.left,al);
        fun(t.right,al);
    }
}
