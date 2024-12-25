import java.util.Scanner;

class Power {

    static double xpowerN(double x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        return x*xpowerN(x,n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter x:");
        double x=sc.nextDouble();

        System.out.println("Enter n:");
        int n=sc.nextInt();

        System.out.println(x+" power "+n+" is:"+xpowerN(x,n));
        
    }
}
