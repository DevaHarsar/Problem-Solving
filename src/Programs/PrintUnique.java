import java.util.*;

public class PrintUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> l1 = new ArrayList<>();
        int j=1;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[j])
            {
                l1.add(arr[i]);
                j++;
            }
        }
        for(int i:l1)
        {
            System.out.println(i);
        }
    }
}
