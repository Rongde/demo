package Day01;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,5,8,11,19,22,31,35,40,45,48,49,50};
        int target = 0;
        int idx = binarySearch(array, target);

        System.out.println("target = " + target + " idx = " + idx);
    }



    public static int binarySearch(int[] array, int target){
        //parameters
        int l = 0;
        int r = array.length - 1;
        int m = l + (r - l) / 2 ; // (r+l)/2 , (r+l) >>> 2

        //method
        int i = 0;
        while (r >= l) {
            System.out.println("i = " + i);
            System.out.println("r = " + r);
            System.out.println("l = " + l);
            System.out.println("m = " + m);
            System.out.println("array[m] = " + array[m]);
            System.out.println();

            if (target == array[m]) {
                return m;
            } else if (target > array[m]) {
                l = m + 1;
                m = l + (r - l) / 2 ;
            } else if (target < array[m]) {
                r = m - 1;
                m = l + (r - l) / 2 ;
            }
            i += 1;

            if (i > 10) break;
        }

        return -1;

//        //start index
//        int startIndex = 0;
//
//        //end index
//        int endIndex = array.length;
//
//        //middle index
//        int middleIndex = (endIndex - startIndex) / 2;
//
//        //method
//        int k = 0;
//        while (k != 10) {
//            System.out.println("k = " + k);
//            System.out.println("array[middleIndex] = " + array[middleIndex]);
//            if (startIndex == middleIndex || endIndex == middleIndex) {
//                return -2;
//            }
//
//
//            if (idx == array[middleIndex]) {
//                return array[middleIndex];
//            } else if (idx > array[middleIndex]) {
//                startIndex = middleIndex;
//                middleIndex = ((endIndex - startIndex) / 2) + startIndex;
//
//            } else if (idx < array[middleIndex]) {
//                endIndex = middleIndex;
//                middleIndex = ((endIndex - startIndex) / 2) + startIndex;
//            }
//
//            k += 1;
//        }
//
//        return -1;

    }
}
