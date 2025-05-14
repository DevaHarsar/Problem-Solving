import java.util.*;
public class PostfixtoInfix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack<String>s1=new Stack<>();
        String str=sc.nextLine();
        for(char ch:str.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
             s1.push(String.valueOf(ch));
            else{
                String op1=s1.pop();
                String op2=s1.pop();
                s1.push("("+op2+ch+op1+")");
            }
        }
        System.out.println(s1.peek());
    }

}