import java.util.Scanner;

public class Doubly {
    
    static Node head;
    private int size;

    Doubly() {
        head = null;
        size = 0;
    }

    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node currNode = head;

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.prev = currNode;
        size++;
    }

    public void addMiddle(int data, int index) {
        if (index < 1 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node currNode = head;

        while (index > 1) {
            currNode = currNode.next;
            index--;
        }

        newNode.next = currNode.next;
        if (currNode.next != null) {
            currNode.next.prev = newNode;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
        size++;
    }

    public void delFirst()
    {
        if(head==null)
        {
            System.out.println("Linkedlist is empty");
            return;
        }
          
        if (head.next == null) {
            head = null;
        } else {
        head=head.next;
        head.prev=null;
        }
        size--;
    }

    public void delLast()
    {
        if(head==null)
        {
            delFirst();
            return;
        }

        Node currNode=head;

        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.prev.next=null;
        size--;
    }

    public void delMiddle(int index)
    {
        if(head==null)
        {
            delFirst();
            return;
        }
        
        if(index<1 || index>size)
        {
            System.out.println("Invalid index");
            return;
        }

        Node currNode=head;

       for(int i=0;i<index-1;i++)
       {
        currNode=currNode.next;
       }
       Node nodeTodel=currNode.next;

       if(nodeTodel==null)
       {
        currNode.next=null;
       }
       else{
        currNode.next=nodeTodel.next;
        nodeTodel.next.prev=currNode;
       }
       size--;
    }

    public void traversal() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Scanner sc = new Scanner(System.in);
        boolean continueTraversal = true;
        
        while (continueTraversal) {
            System.out.println("1. Forward Traversal");
            System.out.println("2. Backward Traversal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Forward Traversal:");
                    forwardTraversal();
                    break;
                case 2:
                    System.out.println("Backward Traversal:");
                    backwardTraversal();
                    break;
                case 3:
                    continueTraversal = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }
        sc.close();
    }

    public void forwardTraversal() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void backwardTraversal() {
        Node currNode = head;
        if (currNode == null) return;

        // Move to the last node
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        // Traverse backwards
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.prev;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Doubly list = new Doubly();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        
        list.addMiddle(100, 3); // Inserting in the middle at index 3

        list.addLast(5);
        list.addLast(1);

        list.delFirst();

        list.delLast();

        list.delMiddle(2);

        System.out.println("Size of doubly linked list is: " + list.size);

        list.traversal();
    }
}
