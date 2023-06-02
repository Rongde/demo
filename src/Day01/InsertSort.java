package Day01;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] a = {9, 3, 7, 2, 5, 8, 1,4};
        insert(a);
        System.out.println(Arrays.toString(a));
    }

    private static void insert(int[] a) {
        int n = 0;

        for (int i = 1; i < a.length; i++) {
            int t = a[i];
            int j = i - 1;
            while (j >= 0) {
                if (t < a[j]) {
                    a[j+1] = a[j];
                } else {
                    break;
                }
                j--;
            }

            a[j+1] = t;
            n++;
            System.out.println("InsertSelection " + n + " " + Arrays.toString(a));
        }
    }
}
