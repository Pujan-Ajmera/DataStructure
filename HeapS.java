import java.util.*;
class HeapS{
    public static void main(String[] args){
        int[] a ={10,123,22,178,84,868,34,294,53,12};
        int n =  a.length;
        heapsort(a,n);
        
            System.out.print(Arrays.toString(a));
    }
    public static void heapsort(int[] a,int n){
        buildMaxheap(a,n);
        for(int i = n-1;i>=0;i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a,i,0);
        }
    }
    public static void buildMaxheap(int[] a,int n){
        for(int i=n/2-1;i>=0;i--){
            heapify(a,n,i);
        }
    }
    public static void heapify(int[] a,int n,int i){
        int maxIndex  = i;
        int leftchild = 2*i+1;
        int rightchild = 2*i+2;
        if(leftchild<n && a[leftchild]>a[maxIndex]){
            maxIndex = leftchild;
        }
        if(rightchild<n && a[rightchild]>a[maxIndex]){
            maxIndex = rightchild;
        }
        if(i!=maxIndex){
            int temp = a[i];
            a[i] = a[maxIndex];
            a[maxIndex] = temp;
            heapify(a,n,maxIndex);
        }
    }
}