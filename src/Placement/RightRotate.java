package Placement;

import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int rot=sc.nextInt()%n;
//        for(int i=0;i<=rot;i++)
//        {
            rotate(arr,rot);
//        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int arr[],int rot)
    {
        int temp[]=new int[arr.length];
        int index=0;
        for(int i=rot;i<arr.length;i++)
        {
            temp[index++]=arr[i];
        }
        for(int i=0;i<rot;i++)
        {
            temp[index++]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=temp[i];
        }
    }
}
