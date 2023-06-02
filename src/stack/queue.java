package stack;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        /* 初始化队列 */
        Queue<Integer> queue = new LinkedList<>();

        /* 元素入队 */
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        /* 访问队首元素 */
        int peak = queue.peek();
        System.out.println("访问队首元素");
        System.out.println(peak);

        /* 元素出队 */
        int poll = queue.poll();
        System.out.println("元素出队");
        System.out.println(poll);

        /* 获取队列的长度 */
        int size = queue.size();
        System.out.println("获取队列的长度");
        System.out.println(size);

        /* 判断队列是否为空 */
        Boolean isEmpty = queue.isEmpty();
        System.out.println("判断队列是否为空");
        System.out.println(isEmpty);

    }
}
