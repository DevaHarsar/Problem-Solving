import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int m = sc.nextInt();
        int arr1[]=new int[m];
        for(int i=0;i<m;i++) arr1[i]=sc.nextInt();
       for(int i:arr)
       {
           for(int j:arr1)
           {
               if(i==j) {
                   System.out.print(j);
                   break;
               }
           }
       }
    }
}
