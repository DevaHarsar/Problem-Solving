public class Armstrong_from_n {
    public static void main(String[] args) {
        int n = 1;
        int n1=500;
        for(int i=1;i<n1;i++)
        {
            int org=i;
            String str = Integer.toString(i);
            int digit = str.length();
            int sum=0;
            while(org!=0)
            {
                int rem=org%10;
                sum+=(int)Math.pow(rem,digit);
                org/=10;
            }
            if(i==sum) System.out.println(i+" ");
        }
    }
}
