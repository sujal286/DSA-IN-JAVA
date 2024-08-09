package Sorting;
//TC-O(nlogn)
//SC-O(n)
import java.util.Scanner;

class MergeSort {
    public static void merge(int arr[], int beg, int mid, int end) {
        int i = beg, j = mid + 1, k = 0;
        int temp[] = new int[end - beg + 1];

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (k = 0; k < temp.length; k++) {
            arr[beg + k] = temp[k];
        }
    }

    public static void display(int arr[], int s) {
        System.out.println("After sorted:");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, arr.length - 1);
        display(arr, size);
    }
}

