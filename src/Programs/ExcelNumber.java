import java.util.*;
public class ExcelNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int res=0;
        for(char ch:str.toCharArray())
        {
            res*=26;
            res+=(ch-'A'+1);
        }
        System.out.print(res);
    }
}
