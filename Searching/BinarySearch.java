package Searching;
//TC-O(logn)
//SC-(1)
import java.util.Scanner;
class BinarySearch 
{
    public static int binarySearch(int arr[],int k,int s)
    {
        int low=0,high=s-1,mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(k==arr[mid])
            return mid;
            else if(k>arr[mid])
            low=mid+1;
            else
            high=mid-1;
        }
        return -1;
    }
  public static void main(String args[])
  {
    System.out.println("Enter size of array:");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter elements of array in sorted form:");
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the element you want to search:");
    int key=sc.nextInt();
    int p=binarySearch(arr,key,size);
    if(p==-1)
    System.out.println("Cannot find the element");
    else
    System.out.println(key+" found at:"+p);
  }    
}
