package Placement;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        int n =10;
        int m=20;
        for(int i=n;i<=m;i++)
        {
            boolean val=true;
            for(int j=2;j<Math.sqrt(i);j++)
            {
                if(i%j==0) {
                    val = false;
                    break;
                }
            }
            if(val)
            {
                System.out.print(i+" ");
            }


        }
    }
}
