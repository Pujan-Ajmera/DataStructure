
public class SetOrUnset {
    public static void main(String[] args) {
        int n=13,i=1;
        int m=n;
        int v =1<<i;
        if((n&v)>0){
            System.out.println("set");
        }
        else{
           System.out.println("unset"); 
        }
        
        int k = m>>i;
        if((k&1)>0){
            System.out.println("true");
        }
        else{
            System.out.println("fakse");
        }
        
    }
}