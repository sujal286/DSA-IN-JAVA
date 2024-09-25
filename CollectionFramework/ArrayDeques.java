import java.util.ArrayDeque;

public class ArrayDeques {

    public static void main(String args[])
    {
        ArrayDeque<Integer> ad=new ArrayDeque<>();

        ad.offer(1);
        ad.offerFirst(2);
        ad.offerLast(3);
        ad.offerFirst(4);

        System.out.println("ArrayDeque: " + ad);

        System.out.println(ad.peek());

        System.out.println(ad.poll());

        System.out.println("ArrayDeque: " + ad);
    }
    
}
