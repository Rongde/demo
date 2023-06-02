package stack;

import java.util.Deque;
import java.util.LinkedList;

public class Dqueue {

    public static void main(String[] args) {
        /* 初始化双向队列 */
        Deque<Integer> dqueue = new LinkedList<>();

        /* 元素入队 */
        dqueue.offerLast(2);
        dqueue.offerLast(4);
        dqueue.offerLast(5);
        dqueue.offerFirst(1);
        dqueue.offerFirst(3);

        /* 访问元素 */
        int peakFirst = dqueue.peekFirst();
        System.out.println("访问元素peakFirst");
        System.out.println(peakFirst);
        int peakLast = dqueue.peekLast();
        System.out.println("访问元素peakLast");
        System.out.println(peakLast);

        /* 元素出队 */
        int pollFirst = dqueue.pollFirst();
        System.out.println("元素出队pollFirst");
        System.out.println(pollFirst);
        int pollLast = dqueue.pollLast();
        System.out.println("元素出队pollLast");
        System.out.println(pollLast);


        /* 获取双向队列的长度 */
        int size = dqueue.size();
        System.out.println("获取双向队列的长度");
        System.out.println(size);


        /* 判断双向队列是否为空 */
        Boolean isEmpty = dqueue.isEmpty();
        System.out.println("判断双向队列是否为空");
        System.out.println(isEmpty);

    }
}
