package JavaCollectionFramework;

import java.util.LinkedList;

public class Queue {
    static void main() {
        // Queue
        java.util.Queue<Integer> q = new LinkedList<>();

        // add -> offer
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);

        // remove -. poll
        System.out.println("Removing: "+ q.poll());
        System.out.println(q);

        // peek
        System.out.println("Peeking: "+ q.peek());

    }
}
