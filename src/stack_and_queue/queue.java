package stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(4);
        queue.offer(8);
        queue.offer(3);
        queue.offer(5);

        System.out.println(queue);

        int peek = queue.peek();
        System.out.println(peek);

        System.out.println(queue.poll());

        System.out.println(queue.size());

        System.out.println(queue.isEmpty());

    }
}
