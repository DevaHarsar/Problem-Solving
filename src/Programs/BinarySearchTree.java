package Programs;


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
public class BinarySearchTree {

    public static Node insert(Node root,int key)
    {
        if(root==null)
             return new Node(key);
        if(root.data==key)
             return root;
        else if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);


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
//        System.out.println();

    }public static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
//        System.out.println();

    }public static void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
//        System.out.println();

    }
    public static int height(Node root)
    {
        if(root==null) return -1;
        int l1=height(root.left);
        int l2=height(root.right);
        return 1+Math.max(l1,l2);
    }
    public static int depth(Node root,int x)
    {
        if(root==null) return -1;
//        int dist=-1;
//        if((root.data==x )|| (dist=depth(root.left,x))>=0|| (dist=depth(root.right,x))>=0)
//             return dist+1;
//        return dist;
        int d=-1;
        while(root!=null)
        {
            if(root.data==x) return d;

            if(root.data<x)
                root=root.right;
            else
                root=root.left;

            d++;

        }
        return d;
    }

//        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//            if(root==null || root==p || root==q) return root;
//
//            TreeNode left=lowestCommonAncestor(root.left,p,q);
//            TreeNode right =lowestCommonAncestor(root.right,p,q);
//
//            if(left!=null && right!=null) return root;
//            if(left!=null)return left;
//            else return right;
//        } ansestor problems

    public static Node delnode(Node root,int key)
    {
        if(root==null) return root;
        if(root.data>key)
             root.left=delnode(root.left,key);
        else if(root.data<key)
             root.right=delnode(root.right,key);
        else {
            if(root.left==null)
                 return root.right;
            else if(root.right==null)
                return root.left;
            Node succ=getsucc(root);
            root.data=succ.data;
            root.right=delnode(root.right,succ.data);

        }
            return root;
    }
    public static Node getsucc(Node root)
    {
        Node curr=root.right;
        while(curr!=null && curr.left!=null)
        {
            curr=curr.left;
        }
        return curr;
    }
    int diameter;
    public int diameterOfBinaryTree(Node root) {
        diameter=0;
        help(root);
        return diameter;
    }
    public int help(Node root)
    {
        if(root==null) return 0;
        int l=help(root.left);
        int r=help(root.right);
        diameter=Math.max(diameter,l+r);
        return Math.max(l,r)+1;
    }

    public static void main(String[] args) {
        Node root=null;
        root=insert(root,4);
        root=insert(root,2);
        root=insert(root,10);
        root=insert(root,15);
        root=insert(root,20);

        inorder(root);
        preorder(root);
        postorder(root);

        System.out.println("Height is "+height(root));
        System.out.println("Depth is "+depth(root,15));

        root= delnode(root,10);
        System.out.println("Deletion of the node next");
        inorder(root);

    }
}
