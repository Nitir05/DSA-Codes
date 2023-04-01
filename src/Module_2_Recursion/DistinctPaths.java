package Module_2_Recursion;

import java.util.Scanner;

public class DistinctPaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of m & n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        //int ans = countPaths1(0,0,m,n);
        //System.out.println(ans);
        countPaths2(0,0,m,n);
    }
    static int countPaths1(int i, int j, int m, int n) {
        if(i==m-1 || j==n-1)
            return 1;
        return (countPaths1(i,j+1,m,n) + countPaths1(i+1,j,m,n));
    }

    static void countPaths2(int i, int j,int m, int n) {
        int count = 0;
        if(i==m-1 || j==n-1){
            count++;
            System.out.println(count);
            return;
        }
        countPaths2(i,j+1,m,n);
        countPaths2(i+1,j,m,n);
    }
}
