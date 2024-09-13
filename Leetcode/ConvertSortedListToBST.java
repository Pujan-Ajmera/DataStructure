class Solution {
    public TreeNode sortedListToBST(ListNode head) {
         ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            al.add(temp.val);
            temp = temp.next;
        }
        TreeNode root = null;
        return ans(root,al,0,al.size()-1);
    }
    public TreeNode ans(TreeNode root,ArrayList<Integer> al, int left, int right){
        if(left > right){
            return null;
        }
        int mid  = (left+right)/2;
        TreeNode node = new TreeNode(al.get(mid));
        node.left = ans(node,al,left,mid-1);
        node.right = ans(node,al,mid+1,right);
        return node;
    }
}
