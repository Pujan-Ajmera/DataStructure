class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int n=inorder.length;
        int[] ind={n-1};
        return ans(inorder,postorder,n-1,0,ind);
    }
    TreeNode ans(int[] inorder,int[] postorder,int start,int end,int[] ind){
        if(start<end)return null;
        int rootval=postorder[ind[0]];
        TreeNode root = new TreeNode(rootval);
        ind[0]--;
        int i=start;
        for(;i>=end;i--){
            if(inorder[i]==rootval)break;
        }
        root.right = ans(inorder, postorder, start, i + 1, ind);

    

    

    root.left = ans(inorder, postorder, i - 1, end, ind);

    

    return root;
    }
}
