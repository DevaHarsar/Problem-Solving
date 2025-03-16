package Sorting;

import java.util.ArrayList;

public class MergerSort {
    public static void merge(int arr[],int low,int mid,int high)
    {
        ArrayList<Integer>l1=new ArrayList<>();
         int left=low,right=mid+1;

         while(left<=mid && right<=high )
         {
             if(arr[left]<=arr[right])
             {
                 l1.add(arr[left]);
                 left++;
             }
             else {
                 l1.add(arr[right]);
                 right++;

             }
         }
         while(left<=mid)
         {
             l1.add(arr[left]);
             left++;
         }
         while(right<=high)
         {
             l1.add(arr[right]);
             right++;
         }
         for(int i=0;i< l1.size();i++)
         {
             arr[low+i]=l1.get(i);
         }

    }
    public static void mergersort(int arr[],int low,int high)
    {
        int left=low,right=high;
        int mid=(low+high)/2;
        if(left>=right) return;
        mergersort(arr,left,mid);
        mergersort(arr,mid+1,right);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int arr[]={7,4,5,1,2,5,3,6,9};
        mergersort(arr,0,arr.length-1);
        for(int i:arr)
            System.out.println(i);
    }
}
