package Advanced_Day1_Extends;

public class Teacher extends Person{

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("姓名为" + super.getName() + "，年龄为" + super.getAge() + ",正在讲课");
    }
}
