
public class Clumsy {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    public static int clumsy(int n){
        if(n==1){
            return 1;
        }
        else{
            int v=1;
            int res=n;
            for(int i=n;i>=1&&n>0;i--){
                if(v==1){
                    res=res*(n-1);
                }
                else if(v==2){
                    res=res/(n);
                }
                else if(v==3){
                    res=res+(n);
                }
                else if(v==4 && n>0){
                    res=res-(n);
                v=0;
                }
                v++;//2
                n=n-1;//8 10*9/7
            }
            return res;
        }
    }
}