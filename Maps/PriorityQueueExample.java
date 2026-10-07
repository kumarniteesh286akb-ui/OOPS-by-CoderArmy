package Maps;
import java.util.*;
public class PriorityQueueExample {
    public static void main(String[] args) {

        //<Min heap implementation->
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());



        //        Max heap->
        System.out.println("The priority Queue using the max heap....");
        PriorityQueue<Integer> pq1 = new PriorityQueue<>((a,b)->b-a);
        pq1.offer(10);
        pq1.offer(20);
        pq1.offer(30);
        pq1.offer(40);
        pq1.offer(50);
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());

    }
}
