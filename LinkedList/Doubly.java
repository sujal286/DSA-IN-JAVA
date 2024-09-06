import java.util.Scanner;

public class Doubly {
    
    static Node head;
    private int size;

    Doubly()
    {
        head=null;
        size=0;
    }

    public class Node
    {
        int data;
        Node next;
        Node prev;
            
            Node(int data)
            {
              this.data=data;
              this.prev=null;
              this.next=null;
            }
    }

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        
        if(head==null)
        {
            head=newNode;
            head.prev=null;
            head.next=null;
            size++;
            return;
        }

        newNode.next=head;
        newNode.prev=null;
        head.prev=newNode;
        head=newNode;
        size++;
    }

    public void traversal()
    {
        if(head==null)
        {
            System.out.println("Linkedlist is empty");
            return;
        }
        while(true)
        {
           System.out.println("1.Forward Traversal");
           System.out.println("2.Backward Traversal");
           System.out.println("Enter your choice:");
           Scanner sc=new Scanner(System.in);
           int ch=sc.nextInt();
           switch(ch)
           {
            case 1:
            {
                System.out.println("Forward Traversal:");
                forwardTraversal();
                break;
            }
            case 2:
            {
                System.out.println("Backward Traversal:");
                backwardTraversal();
                break;
            }
            case 3:
            {
                System.exit(0);
            }
            default:
            {
               System.out.println("Invalid choice.Please enter a valid choice");
            }
           }
        }
    }

    public void forwardTraversal()
    {
       Node currNode=head;
       while(currNode!=null)
       {
        System.out.print(currNode.data+"->");
        currNode=currNode.next;
       }
       System.out.println("NULL");
    }

    public void backwardTraversal()
    {
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }

        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.prev;
        }
        System.out.println("NULL");
    }

    public static void main(String args[])
    {
        Doubly list=new Doubly();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        list.traversal();
    }
    
}
