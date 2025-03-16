package TodayProgramming;

import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[]=str.split(" ");
        for(String i:arr)
        {
            if(ispalin(i))
            {
                System.out.println(i);
            }
        }

    }
    public static boolean ispalin(String str)
    {
        StringBuilder rev=new StringBuilder(str);
        return rev.reverse().toString().equals(str);
    }
}

