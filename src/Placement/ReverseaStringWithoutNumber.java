package Placement;

import java.util.Scanner;

public class ReverseaStringWithoutNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[]=str.toCharArray();
        int start=0;
        int end = arr.length-1;
        while(start<=end)
        {
            if(Character.isLetter(arr[start]) && Character.isLetter(arr[end]))
            {
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            else if(!Character.isLetter(arr[start])) start++;
            else if(!Character.isLetter(arr[end])) end--;
        }
        for(char ch:arr)
            System.out.print(ch);

    }
}
