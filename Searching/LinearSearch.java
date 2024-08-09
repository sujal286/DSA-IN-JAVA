package Searching;
//LINEAR SEARCH
//Time Complexity-O(n)
//Space Complexity-O(1)
import java.util.*;
class LinearSearch
{
    public static int linearSearch(int arr[],int k,int s)
    {
       for(int i=0;i<s;i++)
       {
        if(k==arr[i])
        {
            return i;
        }
       }
       return -1;
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
        System.out.println("Enter the element you want to search:");
        int key=sc.nextInt();
        int p=linearSearch(arr,key,size);
        if(p==-1)
        System.out.println("Cannot find the element");
        else
        System.out.println(key+" found at:"+p);
    }
}