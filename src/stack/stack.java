package stack;

import java.util.ArrayList;

public class stack {
    public static void main(String[] args) {
        /* 初始化栈 */
        // 在 Java 中，推荐将 ArrayList 当作栈来使用

        /* 元素入栈 */

        /* 访问栈顶元素 */

        /* 元素出栈 */

        /* 获取栈的长度 */

        /* 判断是否为空 */

        /************/
        /* 初始化栈 */
        // 在 Java 中，推荐将 ArrayList 当作栈来使用
        ArrayList<Integer> stack = new ArrayList<>();

        /* 元素入栈 */
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        /* 访问栈顶元素 */
        int peak = stack.get(stack.size()-1);
        System.out.println("访问栈顶元素");
        System.out.println(peak);

        /* 元素出栈 */
        int pop = stack.remove(stack.size()-1);
        System.out.println("元素出栈");
        System.out.println(pop);

        /* 获取栈的长度 */
        int len = stack.size();
        System.out.println("获取栈的长度");
        System.out.println(len);

        /* 判断是否为空 */
        boolean isEmpty = stack.isEmpty();
        System.out.println("判断是否为空");
        System.out.println(isEmpty);
        /************/

    }
}
