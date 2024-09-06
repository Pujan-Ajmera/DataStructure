import java.util.*;
public class shell{
	public static void main(String[] args) {
		int[] a = { 10, 24, 5, 122, 44, 2, 1, 2, 3, 4, 5, 6 };
		int n   = a.length;
		for(int gap = n/2;gap>=1;gap = gap/2){
			for(int j = gap;j<n;j++){
				for(int i = j-gap;i>=0;i = i-gap){
					if(a[i+gap]>a[i]){
						break;
					}
					else{
						a[i] = a[i]+a[i+gap];
			  			a[i+gap] = a[i] -a[i+gap];
			  			a[i] = a[i]- a[i+gap];
					}
				}
			}
		}

		  System.out.println(Arrays.toString(a)+" shell");
	}
}