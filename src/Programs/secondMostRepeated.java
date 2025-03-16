package Programs;

import java.util.*;
public class secondMostRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character,Integer> m1 = new HashMap<>();
        for(char ch:str.toCharArray() )
        {
            m1.put(ch,m1.getOrDefault(ch,0)+1);
        }

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        char ch='a';
        for(Map.Entry<Character,Integer> e:m1.entrySet())
        {
            int curr=e.getValue();
            if(max1<curr)
            {
                max2=max1;
                max1=e.getValue();
            }
            else if(curr<max1 && curr>max2)
            {
                ch=e.getKey();
                break;
            }

        }
        System.out.print("Second Most frequent Character is:"+ch);
    }
}
