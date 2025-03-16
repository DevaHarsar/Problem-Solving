package Placement;

import java.util.Stack;

public class absoluteRelativePath {
    public static void main(String[] args) {
        String str = "a/b/c/d/e/./../.././a";
        Stack<String> s1 = new Stack<>();
        String arr[]=str.split("/");
        for(String i:arr)
        {
            if(!i.isEmpty())
            {
                if(!i.equals(".") && !i.equals(".."))
                {
                    s1.push(i);
                }
                else if(i.equals(".."))
                {
                    s1.pop();
                }
            }
        }
        System.out.print(s1);
    }
}
