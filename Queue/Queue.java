package Queue;
import java.util.Scanner;
class Queue {
    static int front=-1;
    static int rear=-1;
    static int arr[]=new int[10];
    static Scanner sc=new Scanner(System.in);

    public static void insert()
    {
        if(rear==arr.length-1)
        {
            System.out.println("Queue is full");
            return;
        }
        System.out.println("Enter number you want to insert:");
        int x=sc.nextInt();
        if(front==-1)
        {
        front=0;
        }
        rear++;
        arr[rear]=x;
        System.out.println("Inserted element is:"+x);
    }

    public static void del()
    {
        if(front>rear || front==-1)
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted element is:"+arr[front]);
        front++;
        if(front>rear)
        {
            front=rear=-1;
        }
    }

    public static void display()
    {
        if(front>rear || front==-1)
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements:");
        for(int i=front;i<=rear;i++)
        {
            System.out.println(arr[i]);
        }

    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("QUEUE OPERATIONS:");
            System.out.println("1.INSERT");
            System.out.println("2.DELETE");
            System.out.println("3.DISPLAY");
            System.out.println("4.EXIT");
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    insert();
                    break;
                }
                case 2:
                {
                    del();
                    break;
                }
                case 3:
                {
                    display();
                    break;
                }
                case 4:
                {
                    sc.close();
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Invalid choice.Please enter a valid choice");
                }
            }
        }
    }
}
