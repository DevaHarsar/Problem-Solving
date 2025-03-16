package TodayProgramming;

import java.util.Scanner;

public class SumOfConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int first=arr[0];
        int last=arr[arr.length-1];
        System.out.println(((n)*(first+last))/2);

    }
}
