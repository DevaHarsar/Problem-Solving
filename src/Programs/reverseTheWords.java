import java.util.*;
public class reverseTheWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr1[] = str.split(" ");
        String res="";
        for(String i:arr1) {
            char arr[]=i.toCharArray();
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                if (Character.isLetter(arr[start]) && Character.isLetter(arr[end])) {
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                } else if (Character.isDigit(arr[start])) {
                    start++;
                } else if (Character.isDigit(arr[end])) {
                    end--;
                }
            }
            for(char ch:arr)
            {
                res+=ch;
            }
            res+=" ";
        }

         res=res.toLowerCase();
        String result="";

         String original[]=res.split(" ");
         for(String s:original)
         {
             String first=s.substring(0,1);
             String remaining=s.substring(1,s.length());
             result+=first.toUpperCase()+remaining+" ";
         }
        System.out.println(result);
    }
}
