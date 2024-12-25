import java.util.Scanner;

class Large{
    public static void main(String args[])
    {
        
        System.out.println("Enter size of array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int large=arr[0];

        for(int n:arr)
        {
            if(large<n)
            {
                large=n;
            }
        }
        System.out.println("Largest Number:"+large);
    }
}
