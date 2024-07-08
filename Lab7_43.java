import java.util.*;
public class Lab7_43{
	public static void main(String[] args){
		int[][] arr = {{1,2},{4,5}};
		int n = arr.length;
		for(int i=0;i+1<n;i++){
			int[] a = arr[i+1];

			if(arr[i][1]>=a[0]){
				int min = Math.min(arr[i][0],a[0]);
				int max = Math.max(arr[i][1],a[1]);
				arr[i+1][0] = min;
				arr[i+1][1] = max;
 			}
		}
		Stack<Integer> stack = new Stack<>();
		Set<Stack<Integer>> st = new HashSet<>();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				stack.add(arr[i][j]);
			}
			st.add(stack);
		}
	}
}