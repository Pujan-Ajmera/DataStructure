
public class Lab4_6 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] a1 = {3,7,8,3,2,54,23,9};
        int[] a2 ={7,98,4,1,93,456,56};
        
        int[] ans = new int[a1.length+a2.length];
        int p=0;
        for(int i=0;i<a1.length;i++){
            ans[i]=a1[i];
            p++;
        }
        for(int i=0;i<a2.length;i++){
            ans[p]=a2[i];
            p++;
        }
        
        for(int i=0;i<ans.length;i++){
            int min=ans[i];
            int ind=i;
            
            for(int j=i+1;j<ans.length;j++){
                if(ans[j]<min){
                    min=ans[j];
                    ind=j;
                }
                
            }
            
            int temp=ans[i];
            ans[i]=min;
            ans[ind]=temp;
        }
        for(int num:ans){
            System.out.println(num);
        }
    }
}