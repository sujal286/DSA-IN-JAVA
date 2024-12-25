import java.util.Scanner;

public class Basic {

    static void printN(int n)
    {
        if(n>1)
        {
            printN(n-1);
        }
        System.out.print(n+" ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println("Natural Numbers till "+n+" are:");
        printN(n);
    }
}
