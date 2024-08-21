import java.util.*;
public class PasclesTringle {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(pascle(3));
    }
    
    public static List<List<Integer>> pascle(int numRows){
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        al.add(one);
        if(numRows==1){
            return al;
        }
    List<Integer> two = new ArrayList<>();

        two.add(1);    
        two.add(1);
        al.add(two);
        if(numRows==2){
            return al;
        }
        
      int co=3;
        while(co<=numRows){
            int get = co-2;
            List<Integer> prev = al.get(get);
            ArrayList<Integer> newArrayList = new ArrayList<>();
           newArrayList.add(1);
         
            int where_to_add=1;
            
       for(int i=1;i<=co-2;i++){
           int v1 = prev.get(where_to_add-1);
           int v2 = prev.get(where_to_add);
        newArrayList.add(v1+v2);
           where_to_add++;
       }
            newArrayList.add(1);
            co++;
            al.add(newArrayList);
        }
        return al;
    }
    
}