//insert elements
import java.util.*;
public class Lab4_1{
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};//3
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element and index");
		int index = sc.nextInt();
		int element = sc.nextInt();
		int[] ans = new int[arr1.length+1];
		for(int i=0;i<ans.length;i++){
			if(i<index){
				ans[i]=arr1[i];
			}
			else if(i==index){
				ans[i]=element;
			}
			else(i>index){
				ans[i]=arr1[i-1];
			}
		}
		for(int i=0;i<ans.length;i++){
			System.out.println(ans[i]);
		}

	}
}