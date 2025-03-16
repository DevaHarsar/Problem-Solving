package TodayProgramming;

import java.util.Scanner;

public class Reverse16BitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=32768;
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum*10+rem;

            if(sum>max)
            {
                System.out.print("Sorry unable to reverse");
                return;
            }
            n/=10;
        }
        System.out.println(sum);
    }
}
