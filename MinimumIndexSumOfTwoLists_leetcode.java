import java.util.*;
public class MinimumIndexSumOfTwoLists_leetcode {
    
    public static void main(String[] args) {
        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
        HashMap<String,Integer> sh= new HashMap<>();
        for(int i=0;i<list1.length;i++){
            sh.put(list1[i],i);
        }
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<list2.length;i++){
            if(sh.containsKey(list2[i])){
                st.add(i);
                st.add(sh.get(list2[i]));
            }
        }
        System.out.println(st);
        
        int[] ans = new int[st.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=st.pop();
        }//2,2,0,1,3,0
        int min = Integer.MAX_VALUE;
        Stack<String> ret = new Stack<>();
        
        for(int i=0;i<ans.length;i=i+2){
            if(i==0){
                min = ans[i]+ans[i+1];
                ret.add(list1[ans[i]]);
            }
            else{
                if((ans[i]+ans[i+1])<min){
                    ret.clear();
                    min = ans[i]+ans[i+1];
                    ret.add(list1[ans[i]]);
                }
                else if ((ans[i]+ans[i+1])==min){
                    ret.add(list1[ans[i]]);
                }
            }
            
        }
        String[] a = new String[ret.size()];
        for(int i=0;i<a.length;i++){
            a[i]=(String)ret.pop();
        }
        System.out.println(a);
    }
}