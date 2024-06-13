import java.util.*;
public class Lab3_6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {8,152,8,3,545};
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,mini=-1,maxi=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				mini=i;
				min=arr[i];
			}
			if(arr[i]>max){
				maxi=i;
				max=arr[i];
			}
		}//4 3 3 545
		System.out.println(mini+" "+min+" "+maxi+" "+max);
	}
}