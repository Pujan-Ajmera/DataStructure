import java.util.*;
public class insertion{
	public static void main(String[] args) {
		  int[] a = { 10, 24, 5, 122, 44, 2, 1, 2, 3, 4, 5, 6 };
		  int i = 1;
		  int n = a.length;
		  while(i < n){
		  	int key = a[i];
		  	int j = i-1;
		  	while(j>=0 && a[j]>key){
		  		a[j+1] = a[j];
		  		j--;
		  	}
		  	a[j+1] = key;
		  	i++;

		  }
		 System.out.println(Arrays.toString(a)+" insertion");
	}
}