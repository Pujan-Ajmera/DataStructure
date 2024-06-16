import java.util.*;
public class RemoveElementToEquilizeFreq {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String word="aazz";
        HashMap<Character, Integer> h = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<word.length();i++){
            h.put(word.charAt(i),h.getOrDefault(word.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> v:h.entrySet()){
            set.add(v.getValue());
        }
        
        Iterator ic = set.iterator();
        int i=0,v1=0,v2=0;
        if(set.size()==2){
            
        while(ic.hasNext()){
            if(i==0) v1=(int)ic.next();
            else if(i==1) v2 =(int)ic.next();
                i++;
        } if(Math.abs(v1-v2)==1){
                System.out.println("true");
            }
            else{
                System.out.println("no");
            }
        }
    } 
}