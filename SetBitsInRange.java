
public class SetBitsInRange {
    
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        int n= 5;
        String s = "";
        for(int i=0;i<=n;i++){
            int val = counter(i);
            s+=(val+",");
        }
        System.out.println(s);
    }
    
    public static int counter(int a){
        
        int ans = a;
        int counter =0;
        while(ans!=0){
            ans = ans & ans-1;
            counter++;
        }
        return counter;
    }
}