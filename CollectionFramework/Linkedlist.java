import java.util.LinkedList;

class Linkedlist 
{
    public static void main(String args[])
    {
    LinkedList<String> list=new LinkedList<>();
    
    list.addFirst("Rohit");
    
    list.addLast("is");
    list.addLast("a");
    list.addLast("good");
    list.addLast("boy");

    System.out.println(list);

    System.out.println(list.get(0));
    System.out.println(list);

    System.out.println(list.size());

    list.remove(2);
    System.out.println(list);

    list.removeFirst();
    System.out.println(list);

    list.removeLast();
    System.out.println(list);

    }
}
