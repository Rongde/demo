package Advanced_Day1_Extends;

public class ExtendTest {

    /*
    * Person: name, age
    *
    * Teacher: name, age
    * method: teach
    *           print: 姓名为张三，年龄为30岁的老师，正在讲课
    *
    * Student: name, age, score
    * method: study
    *         print: 姓名为李四，年龄为20岁，成绩为100分的学生，正在学习
    * */

    public static void main(String[] args) {
        
        // teacher
        Teacher t = new Teacher("张三", 30);
        t.teach();

        // student
        Student s = new Student("李四", 20, 100);
        s.study();
    }
}
