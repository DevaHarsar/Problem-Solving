import java.util.*;
public class ValidParenthesis
{
  public static void main(String[] args) {
    Stack<Character> s1 = new Stack<>();
    String str="[";
    for(char ch:str.toCharArray())
    {
        if(ch=='(' || ch=='{' || ch=='[')
        {
            s1.push(ch);
        }
        else{
            if(!s1.isEmpty())
            {
                if(ch==')' && s1.peek()=='(') s1.pop();
                else if(ch==']' && s1.peek()=='[') s1.pop();
                else if(ch=='}' && s1.peek()=='{')s1.pop();
                else
                {
                    System.out.println("False");
                    return;

                }
            }
            else if(s1.isEmpty()) {
                System.out.println("false");return;
                }}
    }
    System.out.println(s1.isEmpty());
  }
}