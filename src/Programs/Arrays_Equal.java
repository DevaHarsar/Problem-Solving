public class Arrays_Equal {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,};
        int arr1[]=new int[]{1,2,3,5};
        for(int i=0,j=0;i<arr.length;i++,j++)
        {
           if(arr[i]!=arr1[j])
           {
               System.out.println("No equal");
               return;
           }
        }
        System.out.println("Equals");
    }
}
