class Circular
{
    static Node head;
    private int size;

    Circular()
    {
        head=null;
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
        if(head==null)
        {
            head=newNode;
            newNode.next=head;
            size++;
            return;
        }
        Node currNode=head;
        while(currNode.next!=head)
        {
            currNode=currNode.next;
        }
        newNode.next=head;
        head=newNode;
        currNode.next=head;
        size++;
    }
    
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            newNode.next=head;
            size++;
            return;
        }
        Node currNode=head;
        while(currNode.next!=head)
        {
           currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.next=head;
        size++;
    }

    public void addMiddle(int data,int index)
    {
        Node newNode=new Node(data);
        if(index<0 || index>size)
        {
            System.out.println("Invalid index");
            return;
        }
        if(head==null)
        {
            head=newNode;
            newNode.next=head;
            size++;
            return;
        }
        if(index==0)
        {
            addFirst(data);
            return;
        }
        Node currNode=head;
        while(index>1)
        {
            currNode=currNode.next;
            index--;
        }
        newNode.next=currNode.next;
        currNode.next=newNode;
        size++;
    }
    public void traversal()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        do{
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }while(currNode!=head);
        System.out.println("HEAD");
    }
    public static void main(String args[])
    {
        Circular list=new Circular();
        
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        list.addLast(7);

        list.addMiddle(8,2);
        list.addMiddle(10,3);
        
        System.out.println("Size of list is:"+list.size);

        list.traversal();
    }
}
