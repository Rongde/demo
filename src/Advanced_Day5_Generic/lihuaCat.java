package Advanced_Day5_Generic;

public class lihuaCat extends Cat{


    public lihuaCat(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + super.getName() + "的，" + super.getAge()
                + "岁的狸花猫，" + "正在鱼");
    }
}
