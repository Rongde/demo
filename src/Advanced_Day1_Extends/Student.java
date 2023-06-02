package Advanced_Day1_Extends;

import java.util.Objects;

public class Student extends Person{

    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }



    public Student() {
    }

    public Student(int score) {
        this.score = score;
    }

    /**
     * 获取
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    public String toString() {
        return "Student{score = " + score + "}";
    }

    public void study() {
        System.out.println("姓名为" + super.getName() + "，年龄为" + super.getAge() + ",成绩为" + score + "，正在学习");
    }
}
