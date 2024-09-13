class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            al.add(temp.val);
            temp = temp.next;
        }
        while(left<right){
            int t = al.get(left-1);
            al.set(left-1,al.get(right-1));
            al.set(right-1,t);
            right--;
            left++;
        }
        ListNode ans = new ListNode(-1);
        temp = ans;
        
        int i = 0;
        while(i<al.size()){
           temp.next = new ListNode(al.get(i));
            temp = temp.next;
            i++;
        }
        return ans.next;
    }
}
