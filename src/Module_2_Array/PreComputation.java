package Module_2_Array;

import java.util.Scanner;

public class PreComputation {
    public static void main(String[] args) {
        prefixMax();
        //alyonaAndFlowers();
    }
    static void alyonaAndFlowers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the Array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //compute prefix sum
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i-1];
        }
        System.out.println("Enter the number of queries");
        int q = sc.nextInt();
        int ans = 0;
        while(q --> 0) {
            System.out.println("Enter l And r indices");
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l!=0)
                ans = arr[r] - arr[l-1];
            else
                ans = arr[r];
            System.out.println("The sum is: " + ans);
        }
    }

    static void prefixMax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //calculate prefix max of array
        for (int i = 1; i < n; i++) {
            arr[i] = Math.max(arr[i], arr[i-1]);
        }
        System.out.println("Enter index till which you want to find the largest number");
        int idx = sc.nextInt();
        if(idx >= 0)
            System.out.println("The largest number till index " + idx +" is " + arr[idx]);
    }
}
