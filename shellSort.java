import java.util.*;
class shellSort{
	public static void main(String[] args) {
		int[] a = {10,85,30,45,88,32,15,148,122};
		int n = a.length;
		for(int gap=n/2;gap>=1;gap=gap/2){
			for(int j=gap;j<n;j++){
				for(int i=j-gap;i>=0;i-=gap){
					if(a[i+gap]>a[i]){
						break;
					}
					else{
						int temp = a[i+gap];
						a[i+gap] = a[i];
						a[i] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}