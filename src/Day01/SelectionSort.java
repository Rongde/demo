package Day01;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 1, 9, 8, 4};

        System.out.println("SelectionSort Before: " + Arrays.toString(a));
        selection(a);
        System.out.println("SelectionSort After: " + Arrays.toString(a));
    }

    public static void selection(int[] a){
        int n = 0;

//        for (int i = 0; i < a.length - 1; i++) {
//            int min = a[i];
//            int index = 0;
//
//            for (int j = i + 1; j < a.length; j++) {
//                if (min > a[j]) {
//                    index = j;
//                    min = a[j];
//                }
//            }
//
//            //swap
//            if (index != 0) {
//                swap(a, i ,index);
//            }
//
//            n += 1;
//            System.out.println("SelectionSort : "  + n + " "+ Arrays.toString(a));
//        }

        for (int i = 0; i < a.length - 1; i++) {
            int s = i;
            for (int j = s + 1; j < a.length; j++) {
                if (a[s] > a[j]) {
                    s = j;
                }
            }

            if (s != i) {
                swap(a, s, i);
            }

            n += 1;
            System.out.println("SelectionSort : "  + n + " "+ Arrays.toString(a));
        }
    }

    public static void swap (int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
