package Day09_Collection;

import java.util.ArrayList;

public class ArrayListTest3 {

    /*
    * 存入学生信息，并找出年龄小于18岁的学生
    * */

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("123","张三",19));
        list.add(new Student("456","李四",15));
        list.add(new Student("789","王五",16));

        ArrayList<Student> newList = newListFilter(list);

        System.out.println(newList);

    }

    private static ArrayList<Student> newListFilter(ArrayList<Student> list) {
        ArrayList<Student> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getAge() < 18) {
                newList.add(student);
            }
        }
        return newList;
    }
}
