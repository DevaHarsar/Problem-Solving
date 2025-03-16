import java.util.*;
public class balancingParantheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> s1 = new Stack<>();
        for(char ch:str.toCharArray())
        {
            if(ch=='(' || ch=='{' || ch=='[')
            {
                s1.push(ch);
            }
            else if(!s1.isEmpty())
            {
                if(ch==')' && s1.peek()=='(')
               {
                s1.pop();
               }
                else if(ch=='}' && s1.peek()=='{')
               {
                s1.pop();
               }
                else if(ch==']' && s1.peek()=='[')
                {
                s1.pop();
                }
            }
                else {
                    System.out.print("false");
                    return;
                }
        }
        if(s1.isEmpty())
        System.out.println(true);
        else
        System.out.println(false);

    }
}
