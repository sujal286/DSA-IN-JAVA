class Linkedlistimp 
{
    static Node head;
    private int size;

    Linkedlistimp()
    {
        size=0;
    }

     public class Node
     {
         int data;
         Node next;
        
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
     }

   public void addFirst(int data)
   {
    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;
    size++;
   }

   public void addLast(int data)
   {
    Node newNode=new Node(data);
    Node lastNode=head; 
    if(head==null)
    {
        head=newNode;
        return;
    }
     while(lastNode.next!=null)
     {
        lastNode=lastNode.next;
     }
     lastNode.next=newNode;
     size++;
   }
 
   public void addMiddle(int data,int index)
   {
    Node newNode=new Node(data);
    Node currNode=head;
    if(head==null || index==0)
    {
        addFirst(data);
        return;
    }
    if(index<0)
    {
        System.out.println("Index cannot be negative");
        return;
    }
    if(index>size)
    {
       System.out.println("index out of bound");
       return;
    }
    size++;
    if(index==1)
    {
        newNode.next=head.next;
        head.next=newNode;
        return;
    }
    while(index>1)
    {
       currNode=currNode.next;
       index--;
    }
    newNode.next=currNode.next;
    currNode.next=newNode;
   }
    public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("Empty!!");
            return;
        }
        head=head.next;
        size--;
    }

    public void removeLast()
    {
        Node currNode=head;
        Node nextcurrNode=head.next;
        if(head==null)
        {
            System.out.println("Empty!!");
            return;
        }
        if(size==1)
        {
            head=null;
        }
        else
        {
        while(nextcurrNode.next!=null)
        {
            currNode=currNode.next;
            nextcurrNode=nextcurrNode.next;
        }
        currNode.next=nextcurrNode.next;
        }
        size--;
    }
    public void removeMiddle(int index)
    {
        Node currNode=head;
        if(head==null)
        {
            System.out.println("empty!!");
            return;
        }

        if(index==0)
        {
            removeFirst();
            return;
        }
        if(index==size-1)
        {
            removeLast();
            return;
        }
        if(index>=size)
        {
            System.out.println("index out of bound");
            return;
        }
        for (int i = 0; i < index - 1; i++)
        {
            currNode = currNode.next;
        }
        currNode.next=currNode.next.next;
        size--;
    }
    public void traversal()
    {
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
     public static void main(String args[])
     {
         Linkedlistimp list=new Linkedlistimp();

         list.addFirst(5);
         list.addFirst(4);

         list.addLast(6);
         list.addLast(7);

         list.addMiddle(10,2);

         System.out.println("Size of the linkedlist is:"+list.size);

         list.traversal();

         System.out.println("After removing first element:");
         list.removeFirst();
         System.out.println("Size of linkedlist is:"+list.size);
         list.traversal();

         System.out.println("After removing last element:");
         list.removeLast();
         System.out.println("Size of linkedlist is:"+list.size);
         list.traversal();

         System.out.println("After removing element from middle:");
         list.removeMiddle(1);
         System.out.println("Size of linkedlist is:"+list.size);
         list.traversal();
         
     }
}
