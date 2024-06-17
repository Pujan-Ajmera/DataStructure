
public class SumOfSquares {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int c=13;
        if(values(c)){
           System.out.println("true"); 
        }
        else{
            System.out.println("false");
        }
    }
    public static boolean values(int c){
        long a = (long)Math.sqrt(c);
           
    long i=0;
        while(i<=a){
            if((i*i+a*a)==c)return true;
 else if((i*i+a*a)<c) i++;
  else if((i*i+a*a)>c)a--;          
        }
        
return false;
    }
}