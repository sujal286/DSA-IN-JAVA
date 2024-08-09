package Stack;
import java.util.Scanner;
class Stack {

    static int arr[]=new int[10];
    static int top=-1;

    public static void push()
    {
     if(top==arr.length-1)
     {
        System.out.println("Stack is full");
        return;
     }
     System.out.println("Enter number you want to push:");
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     top++;
     arr[top]=x;
     System.out.println("Pushed element:"+x);
    }

    public static void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Deleted element is:"+arr[top]);
        top--;
    }

    public static void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("STACK OPERATIONS:");
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.DISPLAY");
            System.out.println("4.EXIT");
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    push();
                    break;
                }
                case 2:
                {
                    pop();
                    break;
                }
                case 3:
                {
                    display();
                    break;
                }
                case 4:
                {
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Invalid Choice.Please enter a valid choice");
                }
            }
        }
    }
}
