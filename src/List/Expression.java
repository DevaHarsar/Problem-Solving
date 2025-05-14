import java.util.*;
public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder res =  new StringBuilder();
        String str=sc.nextLine();
        Stack<Character>s1= new Stack<>();
         for(char ch:str.toCharArray())
         {
            if(Character.isLetterOrDigit(ch))
            {
                res.append(ch);
            }
            else if(ch=='(') 
             s1.push(ch);
             else if(ch==')')
             {
                while(!s1.isEmpty() && s1.peek()!='(')
                  res.append(s1.pop());

                  s1.pop();
             }
             else
             {
                   while(!s1.isEmpty() && prec(ch)<=prec(s1.peek()))
                     res.append(s1.pop());

                     s1.push(ch);
             }
         }
         while(!s1.isEmpty())
           res.append(s1.pop());

           System.out.println(res.toString());
    }
    public static int prec(char ch)
    {
        if(ch=='+' || ch=='-') return 1;
        else if(ch=='*' || ch=='/') return 2;
        else if(ch=='^') return 3;
        else return -1;
    }
}
