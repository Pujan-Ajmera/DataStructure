import java.util.*;
public class HeightChecker {
    
    public static void main(String[] args) {
        int[] heights ={5,1,2,3,4};
        int[] ans= new int[heights.length];
        for(int i=0;i<heights.length;i++){
            ans[i]=heights[i];
        }
        int c=0;
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if((ans[i]-heights[i])!=0){
                c++;
            }
        }
        System.out.println(c);
    }
}