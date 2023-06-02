package Day01;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 9, 8 ,1, 4};
        partition(a, 0, a.length-1);
        quick(a, 0 , a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static int partition (int[] a, int l, int h) {
        int n = 0;
        int pv = a[h];
        int i = l;
        for (int j = l; j < h; j++) {
            if (a[j] < pv) {
                if (i != j) {
                    swap(a, i, j);
                }

                i++;
            }
            n++;
            System.out.println("Quick Sort " + n + " " + Arrays.toString(a) + " i = " + i);
        }
        if (i != h) {
            swap(a, i, h);
        }
        System.out.println("Quick Sort Final " +  Arrays.toString(a) + " i = " + i);
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
