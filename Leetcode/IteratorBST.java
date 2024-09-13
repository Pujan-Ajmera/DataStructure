class BSTIterator {
ArrayList<Integer> al ;
    int i;
    public BSTIterator(TreeNode root) {
        al=new ArrayList<>();
        p(root,al);
        i=0;
    }
    public void p(TreeNode root,ArrayList<Integer> al){
      if(root==null){
          return;
      }  
        p(root.left,al);
        al.add(root.val);
        p(root.right,al);
    }
    public int next() {
       int t=i;
        i++;
      return al.get(t);
        
    }
    
    public boolean hasNext() {
        return i<al.size();
    }
}
