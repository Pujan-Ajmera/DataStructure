class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        boolean[] isFound = {false};
        find(root,key,isFound);
        System.out.print(isFound[0]);
        if(!isFound[0]){
            return root;
        }
       if(root.val==key && root.right==null)return root.left;
        if(root.val==key){
            TreeNode temp=root.right;
            TreeNode attach = root.left;
           root=temp;
            while(temp!=null && temp.left!=null){
                temp=temp.left;
            }
            if(temp!=null)
         temp.left=attach; 
            return root;
        }
        TreeNode prev=null;
        TreeNode temp=root;
        while(temp.val!=key){
            prev=temp;
            if(temp.val<key){
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }
        }
       if(prev.left!=null && prev.left.val==key){
           if(prev.left.right==null){
       prev.left=prev.left.left;
               return root;
           }
          TreeNode t = temp.left;
           prev.left=temp.right;
           temp=temp.right;
           while(temp!=null && temp.left!=null){
               temp=temp.left;
           }
           if(temp!=null)
           temp.left=t;
           return root;
       }
        if(prev.right!=null && prev.right.val==key){
          if(prev.right.right==null){
        prev.right=prev.right.left;
                  return root;
          }
            TreeNode t = temp.left;
           prev.right=temp.right;
            temp=temp.right;
            while(temp!=null && temp.left!=null){
                temp=temp.left;
            }
            if(temp!=null)
            temp.left=t;
            return root;
        }
        return root;
    }
    public void find(TreeNode root,int key,boolean[] isFound){
            if(root!= null && root.val == key)
            {
                isFound[0] = true;
                return;
            }
            else if(root!= null && key < root.val ){
                find(root.left,key,isFound);
            }
            else if(root!= null && key > root.val){
                find(root.right,key,isFound);
            }
    }  
}
