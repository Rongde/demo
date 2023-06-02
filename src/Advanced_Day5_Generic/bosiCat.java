package Advanced_Day5_Generic;

public class bosiCat extends Cat{

    public bosiCat(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + super.getName() + "的，" + super.getAge()
        + "岁的波斯猫，" + "正在吃小饼干");
    }
}
