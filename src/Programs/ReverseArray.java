import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int newarr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int index=0;
        for(int i=n-1;i>=0;i--)
        {
            newarr[index++]=arr[i];
        }
        for(int i:newarr)
        {
            System.out.println(i);
        }
    }
}
