import java.util.*;
public class Ascending_and_Descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start=1,end=n;
       for(int i=1;i<=n;i++)
       {
           System.out.print(start+" "+end+" ");
           start++;
           end--;
       }

    }
}
