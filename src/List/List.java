import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data)
     {
        this.data=data;

     }
}
public class List{
    static Node head,tail,newh1,newt1;
    public static void insert(int key)
    {
        Node n=new Node(key);
            if(head==null)
            {
                 head=n;
                 tail=n;
            }
            else{
                tail.next=n;
                tail=n;
            }
    }
    public static Node reverse(Node head)
    {
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
              next=curr.next;
              curr.next=prev;
              prev=curr;
              curr=next;
        }
        return prev;
    }
     public static Node deepCopy(Node originol)
     {
        while(originol!=null)
        {
            Node newNode=new Node(originol.data);
            if(newh1==null)
            {
                newh1=newNode;
                newt1=newNode;
            }
            else{
             newt1.next=newNode;
             newt1=newNode;
            }
            originol=originol.next;
        }
        return newh1;
     }
    public static void  print(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            insert(sc.nextInt());
        }
        head=reverse(head);
        print(head);

        Node deep=deepCopy(head);
        System.out.println("THe Deep Copy is");
        print(deep);

    }
}