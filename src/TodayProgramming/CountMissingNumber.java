package TodayProgramming;

import java.util.Scanner;

public class CountMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i+1]-arr[i]!=1)
            {
                count+=(arr[i+1]-arr[i]-1);
            }
        }
        System.out.println(count);
    }
}
