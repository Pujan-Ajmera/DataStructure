import java.util.*;
public class LevelOrderTraversal2{
	public static void main(String[] args) {
		
	}
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return al;
        }
        q.offer(root);
        while(q.size() != 0){
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                list.add(temp.val);
            
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                
            }
            al.add(list);
        }

        List<List<Integer>> ans = new ArrayList<>();        
        
       for(int i=al.size()-1;i>=0;i--){
           ans.add(al.get(i));
       }
    return ans;
    }
}