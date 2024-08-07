import java.util.*;
public class InsertionSort{
	public static void main(String[] args) {
		int[] a = {100,120,6,20,56,11,8,97,12,-399,45,51,-22};			
		int i = 1;
		int n = a.length;
		while(i<n){
			int j = i-1;
			int key = a[i];

			while(j>=0 && a[j]>key){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
			i++; 
		}
System.out.println(Arrays.toString(a));

	}
}