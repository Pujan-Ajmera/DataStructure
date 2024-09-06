import java.util.*;
public class selection {
    public static void main(String[] args) {
        int[] a = { 10, 24, 5, 122, 44, 2, 1, 2, 3, 4, 5, 6 };
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int min = a[i];
            int ind = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                    ind = j;
                }
            }
            int temp = a[i];
            a[i] = a[ind];
            a[ind] = temp;
        }
        System.out.println(Arrays.toString(a)+" selection");
    }
}
