package Day08_String;

public class StringBuilder2 {

    /*
    * 输入int[] arr = {1,2,3}
    * 输出[1 ,2, 3]
    * */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        String result = arrToString(arr);

        System.out.println(result);
    }

    public static String arrToString (int[] arr) {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append(", ");
        }

        sb.append(arr[arr.length-1]).append("]");

        return sb.toString();
    }
}
