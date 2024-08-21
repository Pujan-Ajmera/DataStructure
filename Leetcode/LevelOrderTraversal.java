import java.util.*;
public class LevelOrderTraversal{
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
    return al;
    }
}