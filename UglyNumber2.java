
public class UglyNumber2 {
    
    public static void main(String[] args) {
        int counter = 1352;
        int uglycounter=0;
        int i=1;
        int u=0;
        while(uglycounter!=counter){
            boolean val = ugly(i);
            if(val){
                u=i;
                uglycounter++;
            }
            i++;
        }
        System.out.println(counter+"th ugly number is "+u);
        
    }
    
    public static boolean ugly(int n){
        boolean val=true;
        while(n!=1){
            if(n % 2 == 0){
                n/=2;
            }
            
            else if(n % 3 == 0){
                n/=3;
            }
            
            else if(n % 5 == 0){
                n/=5;
            }
            
            else{
                val=false;
                break;
            }
        }
        
        return val;
    }
}