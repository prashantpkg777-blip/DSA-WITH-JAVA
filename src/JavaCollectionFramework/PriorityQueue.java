package JavaCollectionFramework;

import java.util.Queue;

public class PriorityQueue {
    static void main() {
        // PriorityQueue
        Queue<Integer> pq = new java.util.PriorityQueue<>((a,b) -> b - a);

        // Default behaviour -> Integer -> less value -> high priority -> minHeap
        // maxHeap -> Integer -> high value -> high Priority

        pq.offer(40);
        pq.offer(60);
        pq.offer(10);
        pq.offer(30);
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
