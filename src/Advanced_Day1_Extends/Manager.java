package Advanced_Day1_Extends;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name, int age, int salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public Manager() {
    }

    public Manager(int bonus) {
        this.bonus = bonus;
    }

    /**
     * 获取
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * 设置
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Manager{bonus = " + bonus + "}";
    }

    @Override
    public void work() {
        System.out.println("姓名为" + super.getName() + ",年龄为" + super.getAge() + ",工资为" + super.getSalary() +
                ",奖金为" + bonus + "的项目经理正在分配任务");
    }
}
