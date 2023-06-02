package Advanced_Day5_Generic;

public class hashiDog extends Dog{
    public hashiDog(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + super.getName() + "的，" + super.getAge()
                + "岁的哈士奇，" + "正在吃骨头，边吃边拆家");
    }
}
