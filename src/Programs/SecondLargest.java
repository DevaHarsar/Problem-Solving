import java.util.*;


public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> s1 = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s1.add(sc.nextInt());
        }
        int arr[]=new int[s1.size()];
        int index=0;
        for(int i:s1)
        {
            arr[index++]=i;
        }
        Arrays.sort(arr);

        System.out.print(arr[arr.length-2]);
    }
}
