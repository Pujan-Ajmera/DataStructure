import java.util.*;
class counting{
	public static void main(String[] args) {
		int[] a = { 10, 2, 5, 5, 4, 2, 1, 2, 3, 4, 5, 6 };
		int n =a.length;
		int[] b = new int[n];
		int max =  a[0];
		for(int aa: a){
			if(aa>max){
				max = aa;
			}
		}

		int[] count = new int[max+1];

		for(int aa:a){
			count[aa]++;
		}
		//cummitative sum
		for(int i=1;i<max+1;i++){
			count[i] = count[i]+count[i-1];
		}
		for(int i=n-1;i>=0;i--){
			b[count[a[i]]-1] = a[i];
			count[a[i]]--;
		}
			  System.out.println(Arrays.toString(b)+" counting");
	}
}


/*
import java.util.*;

class CountingSort {
    public static void main(String[] args) {
        int[] a = { 10, 2, 5, 5, 4, 2, 1, 2, 3, 4, 5, 6 };
        int n = a.length;
        if (n == 0) {
            System.out.println("Array is empty.");
            return;
        }
        
        // Find the maximum value
        int max = a[0];
        for (int aa : a) {
            if (aa > max) {
                max = aa;
            }
        }

        // Initialize counting array
        int[] count = new int[max + 1];

        // Count occurrences of each value
        for (int aa : a) {
            count[aa]++;
        }

        // Compute cumulative counts
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Initialize output array
        int[] b = new int[n];

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            b[count[a[i]] - 1] = a[i];
            count[a[i]]--;
        }

        // Print the sorted array
        System.out.println(Arrays.toString(b) + " counting");
    }
}
*/