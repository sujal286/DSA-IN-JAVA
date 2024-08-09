package Sorting;
//TC-O(n^2)
//SC-O(1)
import java.util.Scanner;
class BubbleSort 
{
   public static void bubbleSort(int arr[],int s)
    {
        for(int i=0;i<s-1;i++)
        {
            for(int j=0;j<s-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void display(int arr[],int s)
    {
        for(int i=0;i<s;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter size of array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
        bubbleSort(arr,size); 
        display(arr,size);
    }
}
