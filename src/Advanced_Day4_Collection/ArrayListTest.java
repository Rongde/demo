package Advanced_Day4_Collection;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        String ddd = list.set(0, "ddd");
        System.out.println(ddd);

    }
}
