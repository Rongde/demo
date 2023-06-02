package Advanced_Day6_Set;

import java.util.Comparator;
import java.util.TreeSet;

public class setTest6 {

    public static void main(String[] args) {
        /*
        * 需求：创建5个学生对象
        * 属性：（姓名，年龄，语文成绩，数学成绩，英语成绩）
        * 按照总分从高到低输出到控制台
        * 如果总分一样，按照语文成绩排
        * 如果语文一样，按照数学成绩排
        * 如果数学一样，按照英语成绩排
        * 如果英语成绩一样，按照年龄排
        * 如果年龄一样，按照姓名的字母顺序排
        * 如果都一样，认为是同一个学生，不存
        * */

        //1.创建集合
        TreeSet<Student3> st = new TreeSet<>(new Comparator<Student3>() {
            @Override
            public int compare(Student3 o1, Student3 o2) {
                //按照总分从高到低输出到控制台
                int i = (o1.getChinese() + o1.getMath() + o1.getEnglish()) - (o2.getChinese() + o2.getMath() + o2.getEnglish());

                //如果总分一样，按照语文成绩排
                i = i == 0 ? (o1.getChinese() - o2.getChinese()): i;

                //如果语文一样，按照数学成绩排
                i = i == 0 ? (o1.getMath() - o2.getMath()): i;

                //如果数学一样，按照英语成绩排
                i = i == 0 ? (o1.getEnglish() - o2.getEnglish()): i;

                //如果英语成绩一样，按照年龄排
                i = i == 0 ? (o1.getAge() - o2.getAge()): i;

                //如果年龄一样，按照姓名的字母顺序排
                i = i == 0 ? (o1.getName().compareTo(o2.getName())): i;

                return i;
            }
        });

        //2.添加对象
        st.add(new Student3("Zhangsan", 18, 90, 91,92));
        st.add(new Student3("Lisi", 19, 89, 91,89));
        st.add(new Student3("Wangwu", 17, 90, 88,92));
        st.add(new Student3("Zhaoliu", 16, 93, 91,92));
        st.add(new Student3("Sunqi", 20, 90, 91,96));
        st.add(new Student3("Zhangsan", 18, 90, 91,92));

        //3.打印结果
        System.out.println(st);

        for (Student3 student3 : st) {
            System.out.println(student3 + " 总分：" + (student3.getChinese() + student3.getMath() + student3.getEnglish()));
        }

    }
}
