import java.util.*;
public class merge{
		static int[] a = {10,88,99,14,254,01,147,545,68,41,256,245,11,4412};
	public static void main(String[] args) {
		int n = a.length;

		mergeSort(0,n-1);
		System.out.println(Arrays.toString(a)+ " merge");
	}
	public static void mergeSort(int low,int high){
		if(low < high){
			int mid = (low+high)/2;
			mergeSort(low,mid);
			mergeSort(mid+1,high);
			merge(low,mid,high);
		}
	}

	public static void merge(int low,int mid,int high){
		int h=low,i=0,j=mid+1,k;
		int[] b = new int[high-low+1];
		while(h<=mid && j<=high){
			if(a[h]<=a[j]){
				b[i] = a[h];
				h++;
			}else{
				b[i] = a[j];
				j++;
			}
			i++;
		}
		if(h>mid){
			for (k=j;k<=high;k++) {
				b[i] = a[k];
				i++;
			}
		}
		else{
			for (k=h;k<=mid;k++) {
				b[i] = a[k];
				i++;
			}
		}

		for(int p = 0;p<b.length;p++){
			a[low+p] = b[p];
		}
	}
}