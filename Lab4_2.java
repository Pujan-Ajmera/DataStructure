//delete
import java.util.*;
public class Lab4_2{
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};//3
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index");
		int index = sc.nextInt();
		int[] ans = new int[arr1.length-1];
		for(int i=0;i+1<arr1.length;i++){
			if(i<index){
				ans[i]=arr1[i];
			}
			else if(i>=index){
				ans[i]=arr1[i+1];
			}
		}
		for(int i=0;i<ans.length;i++){
			System.out.println(ans[i]);
		}

	}
}