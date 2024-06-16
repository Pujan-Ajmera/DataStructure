
public class primePelindrome {
    
    public static void main(String[] args) {
        int n =6;
        while(true){
            boolean isprime = isprime(n);
            if(isprime){
                boolean ispeli = ispelindrome(n);
                
                if(ispeli){
                    System.out.println(n);
                    break;
                }
            }
                n++;
        }
    }
    
    public static boolean isprime(int n){
        int counter=0;
        boolean val = false;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                counter++;
            }
        }
        
        if(counter==1){
            val = true;
        }
        return val;
    }
    
    public static boolean ispelindrome(int n){
        int sum =0;
        int m = n;
        while(n!=0){
            sum=sum*10+n%10;
            n/=10;
        }
            if(m==sum)
            return true;
            else
            return false;
    }
    
}