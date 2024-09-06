import java.util.*;
class bubble{
	public static void main(String[] args) {
		  int[] a = { 10, 24, 5, 122, 44, 2, 1, 2, 3, 4, 5, 6 };
		  int n = a.length;
		  for(int i=0;i<n-2;i++){
		  	for(int j = 0;j<n-1;j++){
		  		if(a[j]>a[j+1]){
		  			a[j] = a[j]+a[j+1];
		  			a[j+1] = a[j] -a[j+1];
		  			a[j] = a[j]- a[j+1];
		  		}
		  	}
		  }

		  System.out.println(Arrays.toString(a)+" bubble");
	}
}