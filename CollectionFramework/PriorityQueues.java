import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {
    
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(70);
        pq.offer(20);
        pq.offer(30);
        pq.offer(10);

        System.out.println(pq); 

        System.out.println(pq.size());

        if(pq.contains(20))
        {
            System.out.println("Yes,it contains 20");
        }

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
