package Day09_Collection;

import java.util.ArrayList;

public class ArrayListRemove {

    /*
    * 1.ArrayList填入{Test,abc,Test,Test}
    * 2.删除"Test"，剩下{abc}
    * */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Test");
        list.add("abc");
        list.add("Test");
        list.add("Test");

//        method1(list);

        mthod2(list);

        System.out.println(list);
    }

    private static void mthod2(ArrayList<String> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            if ("Test".equals(list.get(i))) {
                list.remove(i);
            }
        }
    }

    private static void method1(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if ("Test".equals(list.get(i))) {
                list.remove(i);
                i --;
            }
        }
    }
}
