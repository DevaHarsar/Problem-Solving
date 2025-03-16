package TodayProgramming;

import java.util.Scanner;

public class GenericRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val=singleDigit(n);
        System.out.println(val);
    }
    public static int singleDigit(int n)
    {
        if(n<10)
             return n;
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return singleDigit(sum);
    }
}
