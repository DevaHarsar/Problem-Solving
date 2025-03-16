package Placement;
//import java.util.*;
//public class StringQuest {
//    public static void main(String[] args) {
//        String str="Hello this is dev get him a cofee get";
//        int index = str.indexOf("get");
//        if(index==-1) return;
//        int secondindex=str.indexOf("get",index+3);
//        if(secondindex==-1) return;
//        System.out.println(secondindex);
//        String result="";
//        result+=str.substring(0,secondindex)+str.substring(secondindex+3,str.length());
//        System.out.print("Result"+result);
//
//    }
//}
// Method overloading By using
// Different Types of Arguments 

import org.w3c.dom.ls.LSOutput;

class Rectangle {
     int a,b,c;
     Rectangle(int a) {
         this.b = a;
     }
     Rectangle(int a,int b,int c)
     {
         this.a=a;
         this.b=b;
         this.c=c;
     }
     void print()
     {

     System.out.println(a+" "+b+" "+c);
     }

}
public class StringQuest{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10);
        Rectangle r2 = new Rectangle(20,30,50);
        r1.print();
        r2.print();

    }
}