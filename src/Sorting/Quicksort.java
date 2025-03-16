package Sorting;

public class Quicksort {
    public static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int partioning(int arr[],int low,int high)
    {
        int pivot=arr[low];
        int i=low,j=high;
        while(i<j)
        {
            while (arr[i]<=pivot && i<=high-1)
                 i++;
            while (arr[j]>pivot && j>=low+1)
                j--;
            if(i<j)
                 swap(arr,i,j);

        }
        swap(arr,low,j);
        return j;
    }
    public static void quickSort(int arr[],int low,int high)
    {
        if(low<high)
        {
        int pivot=partioning(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);

        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,1,3,2,5,6,7};
        int low=0;
        int high = arr.length-1;
        quickSort(arr,low,high);
        for(int i=low;i<=high;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
