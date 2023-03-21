package Module_2_Array;

import java.util.Scanner;

public class MaximizeTheExpression {
    public static void main(String[] args) {
        marvoloGauntRing();
    }

    static void marvoloGauntRing() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Arrays");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter p,q,r constants");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        //Initialise Prefix-Max Array
        int[] pmax = new int[n];
        //Initialise Suffix-Max Array
        int[] smax = new int[n];
        //populate Prefix-Max Array
        pmax[0] = p * arr[0];
        for (int i = 1; i < n; i++) {
            pmax[i] = Math.max(pmax[i-1],p * arr[i]);
        }
        //populate suffix max array
        smax[n-1] = r * arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            smax[i] = Math.max(smax[i+1],r * arr[i]);
        }
        int ans = Integer.MIN_VALUE;
        //calculate the final expression
        for (int i = 1; i < n-1; i++) {
            ans = Math.max(ans, pmax[i-1] + q * arr[i] + smax[i+1]);
        }
        System.out.println("The maximized expression is:- " + ans);
    }
}
