package TodayProgramming;

import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.replaceAll("[0-9]+","@");
        str=str.replaceAll("[a-z]+","");
        str=str.replaceAll("[A-Z]+","A");
        int words=0,alphabets=0,specialchar=0;
        String arr[]=str.split(" ");
        for(String i:arr)
        {
            if(!i.isEmpty());
            words++;
        }
        char arr1[]=str.toCharArray();
        for(char ch:arr1)
        {
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
                 alphabets++;
            else if(!Character.isLetterOrDigit(ch))
                 specialchar++;
        }
        System.out.print("String is: "+str);
        System.out.println("\nWords: "+words+"\nAlphabets: "+alphabets+"\nSpecial Character: "+specialchar);
    }
}
