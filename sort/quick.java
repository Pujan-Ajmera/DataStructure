import java.util.*;
public class quick{
	public static void main(String[] args) {
		int[] a = {10,254,11,148,412,151,554,121,1,1,14,78,9,44,575};
		int n = a.length;
		quickSort(a,0,n-1);	
		System.out.println(Arrays.toString(a));
	}

	public static void quickSort(int[] a,int low,int upper){
		boolean flag = true;
		if(low<upper){
			int j = upper+1;
			while(flag){
				int i = low;
				j = upper+1;
				int key = a[i];
				i++;
				while(a[i]<key){
					i++;
				}
				j--;
				while(a[j]>key){
					j--;
				}
				if(i<j){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				else{
					flag = false;
				}
			}
			int temp = a[j];
			a[j] = a[low];
			a[low] = temp;
			quickSort(a,low,j-1);
			quickSort(a,j+1,upper);
		}
	}
}