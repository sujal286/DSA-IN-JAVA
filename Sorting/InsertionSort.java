package Sorting;
//TC-O(n^2)
//SC-O(1)
import java.util.Scanner;
class InsertionSort 
{
    public static void insertionSort(int arr[],int s)
    {
        for(int i=1;i<s;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;
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
    insertionSort(arr,size);
    display(arr,size);
  }  
}
