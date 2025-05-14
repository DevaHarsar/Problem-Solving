import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class BinarySearchTree
{
    static int dia;
    public static Node insert(Node root,int key)
    {
        if(root==null) return new Node(key);
        if(root.data<key) root.right=insert(root.right, key);
        else root.left=insert(root.left, key);
        return root;
    }
    public static void inorder(Node root)
    {
        if(root!=null)
         {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
         }
    }
    public static int height(Node root)
    {
        if(root==null) return -1;
        int l1=height(root.left);
        int l2=height(root.right);
        return Math.max(l1, l2)+1;
    }
    public static int depth(Node root,int key)
    {
        int d=0;
        while(root!=null)
        {
           if(root.data==key)
             return d;
           if(root.data>key) root=root.left;
           else root=root.right;

           d++;
        }
        return d;
    }
    public static Node delNode(Node root,int key)
    {
        if(root==null) return null;
        if(root.data>key)
         root.left=delNode(root.left, key);
        else if(root.data<key)
          root.right=delNode(root.right, key);
        else
        {
            if(root.left==null)
             return root.right;
            else if(root.right==null)
             return root.left;
            
            Node min=findmin(root);
            root.data=min.data;
            root.right=delNode(root.right,root.data);

        }
        return root;
    }
    public static Node findmin(Node root)
    {
        Node curr=root.right;
        while (curr!=null && curr.left!=null) {
            curr=curr.left;
        }
        return curr;
    }
    public static Node lca(Node root,Node p,Node q)
    {
       
        if(p.data>root.data && root.data>q.data)
          return lca(root.left,p,q);
        else if(p.data<root.data && root.data<q.data)
          return lca(root.right, p, q);
        else return root;
    }

    public static Node find(Node root,int key)
    {
        if(root.data==key) return root;
        else if(root.data<key) return find(root.right,key);
        else  return find(root.left,key);
    }
   
    public static int diameter(Node root)
    {
          dia=0;
          helper(root);
          return dia;
    }
    public static int helper(Node root)
    {
        if(root==null) return 0;
        int l1=helper(root.left);
        int l2=helper(root.right);
        dia=Math.max(l1+l2,dia);
        return Math.max(l1,l2)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root=null;
        int c=0;
        for(int i=0;i<5;i++)
        {
            root=insert(root, sc.nextInt());
        }
        inorder(root);

        System.out.println("Height"+height(root));
        delNode(root, 10);
        System.out.println("After Deletion");
        inorder(root);
        System.out.println("Enter the value for the common ancestor node");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        Node t1=find(root,n1);
        Node t2=find(root,n2);
        Node result=lca(root, t1, t2);
        System.out.println(result.data);
    }
}