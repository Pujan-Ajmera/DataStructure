
public class ClearTheLastSetBit {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int n =13 ;//1101 1100
        //to clear thelast set bit just and the n and n-1;
        System.out.println(n & (n-1));
    }
}