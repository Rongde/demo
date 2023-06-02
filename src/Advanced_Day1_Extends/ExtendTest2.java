package Advanced_Day1_Extends;

public class ExtendTest2 {

    /*
    * Employee:
    * name, age, salary
    * method: work print 员工工作
    *
    * Coder:
    * name, age, salary
    * method: work print 姓名为张三，年龄为23，工资为15000的程序员正在编写代码
    *
    * Manager
    * name, age, salary, bonus
    * method: work print 姓名为李四，年龄为24，工资为18000，奖金为5000的项目经理正在分配任务
    * */

    public static void main(String[] args) {

        // Coder
        Coder c = new Coder("张三", 23, 15000);
        c.work();

        // Manager
        Manager m = new Manager("李四", 24, 18000, 5000);
        m.work();
    }

}
