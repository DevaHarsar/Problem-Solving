package TodayProgramming;

import java.util.Scanner;

public class SumofMissingNumberInConsecutiveSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int first=arr[0];
        int last=arr[arr.length-1];
        int sum=(last*(first+last))/2;
        int sum1=0;
        for(int i:arr)
        {
            sum1+=i;
        }
        System.out.println("The missing number is "+(sum-sum1));
    }
}
