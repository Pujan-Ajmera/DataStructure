
import java.util.*;
public class DecimalToBinary {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt(); 
        String val = Decimal_Binary(n);
        System.out.println("Decimal: "+n+" Binary: "+val);
        
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
}