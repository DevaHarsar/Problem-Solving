package Programs;
import java.util.*;
public class vowelsCheckInthetimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String query = sc.nextLine();
        query = query.replaceAll("[\\[\\]]","");
        str = str.replaceAll("[\"\\[\\]]","");
        String arr[]=str.split(",");
        String arr1[]=query.split("[^0-9]");
        ArrayList<Integer>l1 = new ArrayList<>();
        for(int i=0;i<arr1.length;i+=2)
        {
            int sum = count(arr,Integer.parseInt(arr1[i]),Integer.parseInt(arr1[i+1]));
            l1.add(sum);
        }
        System.out.print(l1);


    }

    public static boolean isVowel(String a)
    {
        char first = a.charAt(0);
        char last = a.charAt(a.length()-1);
        return (first=='a' || first=='e' || first=='i' || first=='o' || first=='u' || first=='A' || first=='E'
         || first=='I' || first=='O' || first=='U') && (last=='a' || last=='e' || last=='i' || last=='o' || last=='u' ||
                last=='A' || last=='E' || last=='I' || last=='O' || last=='U');
    }
    public static int count (String arr[],int a,int b)
    {
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            if(isVowel(arr[i]))
            {
                sum++;
            }
        }
        return  sum;
    }
}
