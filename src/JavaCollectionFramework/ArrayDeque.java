package JavaCollectionFramework;

import java.util.Deque;

public class ArrayDeque {
    static void main() {
        // ArrayDeque
        Deque<Integer> deque = new java.util.ArrayDeque<>();

        // offer
        deque.offer(10);
        deque.offerFirst(1);
        deque.offerLast(100);
        System.out.println(deque);

        // poll
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);

        // size
        System.out.println(deque.size());

        // peek
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
