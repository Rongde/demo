package Day08_String;

public class StringChar {
    public static void main(String[] args) {
        /*
         * 1.toCharArray()
         * 2.charAt()
         * */

        String name = "abcdef";

        print1(name);
        print2(name);
    }

    private static void print2(String name) {

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    private static void print1(String name) {
        char[] chars = name.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
