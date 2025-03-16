package TodayProgramming;

import java.util.Scanner;

public class CountNumberOfPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[]=str.split(" ");
        int c=0;
        for(String i:arr)
        {
            if(ispalin(i))
            {
                c++;
            }
        }
        System.out.println(c);
    }
    public static boolean ispalin(String str)
    {
        StringBuilder rev=new StringBuilder(str);
        return rev.reverse().toString().equals(str);
    }
}
