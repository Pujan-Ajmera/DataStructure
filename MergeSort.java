import java.util.Arrays;

public class MergeSort {
    static int[] a = { 25, 1, 96, 45, 32, 12, 87, 3, 2, 56, 41, 11 };
    static int[] b = new int[a.length];

    public static void main(String[] args) {
        mergesort(0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void mergesort(int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;
            mergesort(low, mid);
            mergesort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public static void merge(int low, int mid, int high) {
        int i = low, j = mid + 1, h = low, k;
        while (h <= mid && j <= high) {
            if (a[h] < a[j]) {
                b[i] = a[h];
                h++;
            } else {
                b[i] = a[j];
                j++;
            }
            i++;
        }

        if (h <= mid) {
            for (k = h; k <= mid; k++) {
                b[i] = a[k];
                i++;
            }
        }

        else if (j <= high) {
            for (k = j; k <= high; k++) {
                b[i] = a[k];
                i++;
            }
        }
        for (k = low; k <= high; k++) {
            a[k] = b[k];
        }
    }

}
