package TodayProgramming;

import java.util.Scanner;

public class ASCIIValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        for(char ch:arr)
        {
            System.out.println((int) ch);
        }
    }
}
