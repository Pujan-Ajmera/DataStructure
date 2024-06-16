import java.util.*;
public class NoOfSetBits {
    public static void main(String[] args) {
       /* System.out.println("Hello, World!");
        String val = Decimal_Binary(13);
        int a = Set_Bit_Counter(val);
        System.out.println("set bits are : "+a);
    }
    public static String Decimal_Binary(int a){
        
        Stack<Integer> s = new Stack<>();
        
        while(a!=0){
            s.add(a % 2);
            a/=2;
        }
        String val = "";
        while(!s.empty()){
            val=val+(s.pop()+"");
        }
        return val;
    }
    public static int Set_Bit_Counter(String val){
        char[] a = val.toCharArray();
        int counter=0;
        for(char p:a){
            if(p=='1'){
                counter++;
            }
        }
        return counter;
    }
    
    */
    
    int n = 129;
    int counter=0;
    while(n!=0){
        n = n & n-1;
        counter++;
      }
        
        System.out.print(counter);
    }
}