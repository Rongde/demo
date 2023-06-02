package Day01;

import java.util.Arrays;

public class QuickSort2 {

    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 9, 8 ,1, 4};
        partition(a, 0, a.length-1);
        quick(a, 0 , a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static int partition (int[] a, int l, int h) {
        int n = 0;
        int pv = a[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (i < j && a[j] > pv) {
                j --;
            }

            while (i < j && a[i] <= pv) {
                i ++;
            }
            swap(a, i, j);
            n ++;
            System.out.println("Quick Sort " + n + " : " + Arrays.toString(a) + " j = " + j);
        }

        swap(a, i, l);
        System.out.println("Quick Sort 2 final : " + Arrays.toString(a) + " j = " + j);

        return i;
    }

    public static void quick(int[] a, int l, int h) {
        if (l >= h) {
            return;
        }
        int p = partition(a, l, h);
        System.out.println("quick(a, l, p-1);");
//        quick(a, l, p-1);
        System.out.println("quick(a, p+1, h);");
        quick(a, p+1, h);
    }

    public static void swap (int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
