package TodayProgramming;

import java.util.Scanner;

public class ReverseStringRetainingSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(Character.isLetterOrDigit(arr[i]) && Character.isLetterOrDigit(arr[j]))
            {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(!Character.isLetterOrDigit(arr[i]))
            {
                i++;
            }
            else if(!Character.isLetterOrDigit(arr[j]))
            {
                j--;
            }
        }
        for(char ch:arr)
        {
            System.out.print(ch);
        }
    }
}
