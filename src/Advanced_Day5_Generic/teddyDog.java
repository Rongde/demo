package Advanced_Day5_Generic;

public class teddyDog extends Dog{


    public teddyDog(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + super.getName() + "的，" + super.getAge()
                + "岁的泰迪，" + "正在吃骨头，边吃边蹭");
    }
}
