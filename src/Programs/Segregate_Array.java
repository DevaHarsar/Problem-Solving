import java.util.Scanner;

public class Segregate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int odd[]=new int[n];
        int even[]=new int[n];
        int eveni=0;
        int oddi=0;
        for(int i:arr)
        {
            if(i%2==0)
                 even[eveni++]=i;
            else
                odd[oddi++]=i;
        }
        System.out.print("Even:");
          for(int i=0;i<eveni;i++)
              System.out.println(even[i]);
          System.out.print("Odd:");
          for(int i=0;i<oddi;i++)
              System.out.println(odd[i]);
    }
}
