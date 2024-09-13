class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode=new TreeNode(val);
        TreeNode temp=root;
        if(root==null){root=newNode;
      return root;
                      }
        while(temp!=null){
            if(val<temp.val){
                if(temp.left==null){
              temp.left=newNode;
                    break;
                }
                temp=temp.left;
            }
            else{
                if(temp.right==null){
             temp.right=newNode;
                        
                    break;
                }
                temp=temp.right;
            }
        }
        
        
        return root;
    }
}
