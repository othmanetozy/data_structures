package queuses;

import java.util.LinkedList;
import java.util.Queue;


// queue is interface extends the collection
public class queuses {
    public static void main(String[] args) {
        //algoritms FIFO = first in first out
        Queue<String> queue = new LinkedList<>();
        // System.out.println(queue.isEmpty());
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        System.out.println(queue.contains("G"));    //contains in queue else false
        //System.out.println(queue.size());
        // System.out.println(queue.peek());
        // queue.poll();   // remove the first queuse
        System.out.println(queue);
    }
}
