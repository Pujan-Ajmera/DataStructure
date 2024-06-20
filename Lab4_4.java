//insert elements
import java.util.*;
public class Lab4_4{
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,7,8};//3
		int[] ans = new int[arr1.length-1];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element");
		int element = sc.nextInt();
	//	int[] ans = new int[arr1.length+1];
		int low =0,high=arr1.length-1,mid=-1;
		while(low<=high){
			mid=(high+low)/2;
			if(arr1[mid]==element){
				break;
			}
			else if(arr1[mid]<element){
				low = mid +1;
			}
			else if(arr1[mid]>element){
				high = mid - 1;
			}
		}

		for(int i=0;i+1<arr1.length;i++){
			if(i<mid){
				ans[i]=arr1[i];
			}
			else if(i>=mid){
				ans[i]=arr1[i+1];
			}
		}

		for(int i=0;i<ans.length;i++){
			System.out.println(ans[i]);
		}

	}
}