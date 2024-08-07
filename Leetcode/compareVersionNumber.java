import java.util.*;
public class compareVersionNumber {
    
    public static void main(String[] args) {
        String version1="1";
        String version2="1.1";
        String[] v1 = version1.split("\\.");

        String[] v2 = version2.split("\\.");

        System.out.println(Arrays.toString(v1));

        System.out.println(Arrays.toString(v2));

        int i=0;

        boolean isfound=true;

        while(i<v1.length && i<v2.length){

            if((Integer.parseInt(v1[i])-Integer.parseInt(v2[i]))<0){

                return -1;

                

                

            }

            else if((Integer.parseInt(v1[i])-Integer.parseInt(v2[i]))>0){

                return 1;

          

         

            }

            i++;

        }

        if(isfound){

            int max = Math.max(v1.length,v2.length);

            if(v1.length==v2.length)

            {

            return 0;

            }

            else if(max==v1.length){
for(int j=0;v2.length+j<v1.length;j++){
                if(Integer.parseInt(v1[v2.length+j])>0)return 1;

                else if(Integer.parseInt(v1[v2.length+j])<0)return -1;
           
            }
}
                

            else if(max==v2.length){
for(int j=0;j+v1.length<v2.length;j++){
                if(Integer.parseInt(v2[v1.length+j])>0) return -1;

                else if(Integer.parseInt(v2[v1.length+j])<0)return 1;

           

            }
            }
        }
        return 0;
    }
}