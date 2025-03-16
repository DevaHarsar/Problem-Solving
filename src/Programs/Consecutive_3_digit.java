import java.util.*;
import java.math.*;

public class Consecutive_3_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        for(int i=0;i<str.length()-2;i++)
        {
            int first = str.charAt(i)-'0';
            int second = str.charAt(i+1)-'0';
            int third = str.charAt(i+2)-'0';
            if(first+1==second && second+1==third)
            {
                System.out.println(true);
                return;
            }
            if(first-1==second && second-1==third)
            {
                System.out.println(true);
                return;
            }

        }
            System.out.println(false);

    }
}
