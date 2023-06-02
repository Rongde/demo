package Day01;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {5, 9 ,7, 4, 1, 3, 2, 8};

        System.out.println("Bubble Before: ");
        System.out.println(Arrays.toString(a));
        System.out.println("");

        bubblev2(a);

        System.out.println("Bubble After: ");
        System.out.println(Arrays.toString(a));
    }

    public static void bubble(int[] a) {
        int n = 0;

        for (int i = 0; i < a.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j+1] < a[j]) {
                    flag = true;
                    swap(a, j, j+1);
                    System.out.println("Compare" + j);
                }
            }

            if (flag != true) {
                break;
            }

            n += 1;
            System.out.print("Bubble Sort " + n + " \n");
            System.out.println(Arrays.toString(a));
            System.out.println("");

        }
    }

    public static void bubblev2(int[] a){
        int n = 0;
        int m = a.length - 1;

        while (n < 10) {
            int last = 0;
            for (int i = 0; i < m; i++) {
                if (a[i] > a[i+1]) {
                    swap(a, i, i+1);
                    last = i;
                    System.out.println("Compare" + i);
                    System.out.println("last " + last);
                }
            }

            m = last;
            if (m == 0) {
                break;
            }

            n += 1;
            System.out.print("Bubble Sort " + n + " \n");
            System.out.println(Arrays.toString(a));
            System.out.println("");
        }


    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
