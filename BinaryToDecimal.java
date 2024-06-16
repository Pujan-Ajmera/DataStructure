import java.util.*;
public class BinaryToDecimal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int n = sc.nextInt();
        String val = Binary_Decimal(n);
        System.out.println("Binary: "+n+" Decimal: "+val);
    }
    
    public static String Binary_Decimal(int a){
       int sum=0;
        int i=0;
        while(a!=0){
            sum=sum+(a%10)*(int)Math.pow(2,i);
            i++;
            a/=10;
        }        
        return sum+"";        
    }
}