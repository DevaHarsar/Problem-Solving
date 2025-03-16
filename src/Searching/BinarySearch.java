package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){ arr[i]=sc.nextInt();}
        int key = sc.nextInt();
          int low=0,high=n-1;
          while (low<=high)
          {
              int mid = (high+low)/2;
              if(arr[mid]==key) {
                  System.out.println(mid);
                  break;
              }
              else if(key<arr[mid])
                  high=mid-1;
              else
                  low= mid+1;
        }

    }
}
