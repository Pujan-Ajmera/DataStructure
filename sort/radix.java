import java.util.*;

class RadixSort {
    public static void main(String[] args) {
        Integer[] a = {10, 11, 4, 5, 11, 19, 14, 111, 125, 45, 45, 847, 10};
        int maxLength = findMaxLength(a);
        int n = a.length;

        List<Queue<Integer>> queues = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            queues.add(new LinkedList<>());
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < n; j++) {
                int digit = (a[j] / (int) Math.pow(10, i)) % 10;
                queues.get(digit).add(a[j]);
            }

            int index = 0;
            for (int k = 0; k < 10; k++) {
                while (!queues.get(k).isEmpty()) {
                    a[index++] = queues.get(k).poll();
                }
            }
        }

        System.out.println(Arrays.toString(a) + " radix");
    }

    public static int findMaxLength(Integer[] a) {
        int max = a[0];
        for (Integer value : a) {
            if (value > max) {
                max = value;
            }
        }
        return Integer.toString(max).length();
    }
}
