import java.util.*;
public class heap{
	public static void main(String[] args) {
		int[] a = {10,13,443,21,245,21,445,5,3,21,22,3345,567,32,45,21,11};
		int n  	= a.length;
		heapSort(a,n);
		System.out.println(Arrays.toString(a)+" heapsort");
	}
	public static void heapSort(int[] a,int n){
		buildMaxHeap(a,n);
		for(int i=n-1;i>=0;i--){
			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			heapify(a,i,0);
		}
	}

	public static void buildMaxHeap(int[] a,int n){
		for(int i=n/2-1;i>=0;i--){
			heapify(a,n,i);
		}
	}

	public static void heapify(int[] a,int n,int i){
		int maxIndex = i;
		int leftchild = 2*i+1;
		int rightchild = 2*i+2;
		
		if(leftchild<n && a[leftchild]>a[maxIndex]){
			maxIndex = leftchild;
		}

		if(rightchild<n && a[rightchild]>a[maxIndex]){
			maxIndex = rightchild;
		}

		if(i!=maxIndex){
			int temp =  a[i];
			a[i] = a[maxIndex];
			a[maxIndex] = temp;
			heapify(a,n,maxIndex);
		}
	}
}