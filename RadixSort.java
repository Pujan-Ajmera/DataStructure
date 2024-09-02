import java.util.*;

public class RadixSort {
    
    public static void main(String[] args) {
        Integer[] b = {67, -456, -218, -939, 536, 366, 928, 737, 10, 1221, 123, 164, 166, 1987, 148};
        Integer[] a = new Integer[b.length];
        
        // Correctly find the minimum value, not its length
        int min = minElement(b); // Find the minimum element itself
        
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i] - min; // Shift to non-negative range
        }
        
        Queue<Integer>[] con = new LinkedList[10];
        int maxlen = maxElementLength(a);
        int n = a.length;
        
        for (int i = 0; i < 10; i++) {
            con[i] = new LinkedList<>();
        }
        
        for (int p = 0; p < maxlen; p++) {
            for (int i = 0; i < n; i++) {
                int index = (a[i] / (int) Math.pow(10, p)) % 10; // Extract the digit
                con[index].offer(a[i]); // Indexing should be between 0 and 9
            }
            int v = 0;
            for (int j = 0; j < 10; j++) {
                while (!con[j].isEmpty()) {
                    a[v++] = con[j].poll(); // Collect sorted values
                }
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + min; // Restore the original values
        }
        
        System.out.print(Arrays.toString(a));
    }

    // Correctly find the minimum value, not its length
    public static int minElement(Integer[] a) {
        int min = Integer.MAX_VALUE;
        for (int value : a) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int maxElementLength(Integer[] a) {
        int max = Integer.MIN_VALUE;
        for (int value : a) {
            if (value > max) {
                max = value;
            }
        }
        return (int) Math.log10(max) + 1; // Calculate the number of digits
    } 
}
