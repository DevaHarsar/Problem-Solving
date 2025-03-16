package TodayProgramming;

import java.util.Scanner;

public class ReadStringOperation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.replaceAll("[aeiouAEIOU]","A");
        str=str.replaceAll("[^a-zA-Z0-9]","A");
        str=str.replaceAll("[^aeiouAEIOU]","a");
        int vowel=0,consonantsdigit=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='A') vowel++;
            else if(str.charAt(i)=='a') consonantsdigit++;

        }
        System.out.println("Vowels and special : "+vowel);
        System.out.println("\nConsonants and Digit: "+consonantsdigit);
    }
}
