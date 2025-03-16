package TodayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        for(String i:arr)
        {
            if(isAnagram(i,arr))
            {
                System.out.println(i);
            }

        }
    }
    public static boolean isAnagram(String str,String arr[])
    {
        char arr1[]=str.toCharArray();
        Arrays.sort(arr1);
        for(String i:arr)
        {
            if(!i.equals(str))
            {
                char array[]=i.toCharArray();
                Arrays.sort(array);
                if(Arrays.equals(arr1,array))
                    return true;
            }
        }
        return  false;

    }
}

