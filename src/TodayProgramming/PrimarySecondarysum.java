package TodayProgramming;

import java.util.Scanner;

public class PrimarySecondarysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int u = 0, b = 0, l = 0, r = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j || i + j == n - 1)//Check for the primary and secondary diagnol
                {
                    continue;
                }
                if (i < j && i + j < n - 1) {
                    u += arr[i][j];
                }
                else if (i < j && i + j > n - 1) {
                    r += arr[i][j];
                }
                else if (i > j && i + j < n - 1) {
                    l += arr[i][j];
                }
                else if (i > j && i + j > n - 1) {
                    b += arr[i][j];
                }


            }
        }

        System.out.println("Upper " + u);
        System.out.println("Lower " + b);
        System.out.println("Left " + l);
        System.out.println("Right " + r);


    }
}
