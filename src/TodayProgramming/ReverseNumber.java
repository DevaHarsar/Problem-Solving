package TodayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[]=str.toCharArray();
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(arr[i]>='0' && arr[i]<='9' && arr[j]>='0' && arr[j]<='9' )
            {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(!(arr[i]>='0' && arr[i]<='9'))
            {
               i++;
            }
            else if(!(arr[j]>='0' && arr[j]<='9')) {
                j--;
            }

        }
        for(char ch:arr)
        {
            System.out.print(ch);
        }
    }
}
