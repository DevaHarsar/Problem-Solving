package Sorting;

import java.util.*;

public class Sorting_Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int find = sc.nextInt();
        int quick[] = new int[n];
        int bubble[] = new int[n];
        int merge[] = new int[n];
        for (int i = 0; i < n; i++) {
            quick[i] = arr[i];
            bubble[i] = arr[i];
            merge[i] = arr[i];
        }

        quicksort(quick, 0, n - 1);
        bubblesort(bubble);
//        mergesort(arr);
        System.out.print(binarysearch(quick,find));

    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partion(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    public static int partion(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;
        while (i < j) {
            while (arr[i] <= pivot && i < high)
                i++;
            while (arr[j] > pivot && j >= low + 1)
                j--;
            if (i < j)
                swap(arr, i, j);
        }
        swap(arr, low, j);
        System.out.println("Quick Passes");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        return j;
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void bubblesort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Bubble passes");
            for (int k : arr) {
                System.out.print(k + " ");
            }
        }
    }
    public static int binarysearch(int arr[],int find)
    {
        int start =0,end=arr.length-1;
        while (start<=end)
        {
            int mid=end-(start+end)/2;
            
        }
        return 1;
    }
}
