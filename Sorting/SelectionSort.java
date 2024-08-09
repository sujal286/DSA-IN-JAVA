package Sorting;
//TC-O(n^2)
//SC-O(1)
import java.util.Scanner;
class SelectionSort 
{
    public static void selectionSort(int arr[],int s)
    {
        for(int i=0;i<s-1;i++)
        {
            int small=i;
            for(int j=i+1;j<s;j++)
            {
              if(arr[j]<arr[small])
              {
                small=j;
              }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
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
        selectionSort(arr,size); 
        display(arr,size);
    }
}
