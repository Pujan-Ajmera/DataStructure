import java.util.*;
public class Minimumincrementtomakeanarrayunique {
    
    public static void main(String[] args) {
        int[] nums ={1,2,2};
        HashMap<Integer,Integer> h = new HashMap<>();
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            set.add(nums[i]);
         }
        
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            set.add(nums[i]);
         }
        
    }
}