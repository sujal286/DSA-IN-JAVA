import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    
    public static void main(String args[])
    {
        Queue<Integer> queue=new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("Queue: " + queue);

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println("Queue: " + queue);
    }
}
