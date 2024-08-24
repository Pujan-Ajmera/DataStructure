import java.util.*;
public class resizeAnArray {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] a = new int[5];
        System.out.println(Arrays.toString(a));
        a = resizeAnArray.resize(a,2*a.length);
        System.out.println(Arrays.toString(a));
    }
    public static int[] resize(int[] a, int cap){
        int[] temp = new int[cap];
        for(int i=0;i<a.length;i++){
            temp[i] = a[i];
        }
        a=temp;
        return a;
    }
    
}