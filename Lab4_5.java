
public class Lab4_5 {
    
    public static void main(String[] args){
        int[] ans={1,5,5,6,7,9,9,6};
        String str="";
        for(int num:ans){
            if(!str.contains(num+"")){
                str+=num;
            }
        }
        int[] val=new int[str.length()];
        for(int i=0;i<val.length;i++){
            val[i]=Integer.parseInt(str.charAt(i)+"");
        }
        
        for(int num:val){
            System.out.println(num);
        }
    }
}