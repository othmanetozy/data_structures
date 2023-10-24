package queuses;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class loop {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();    //in ordre
        queue.offer("SIMO");
        queue.offer("AMINE");
        queue.offer("Othmane");
        queue.offer("Mahmoud");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }


    }
}
