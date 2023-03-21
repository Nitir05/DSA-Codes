package Module_2_Array_Homework;

import java.util.Scanner;

public class BuyAndSellStocks {

    public static void main(String[] args) {
        //bestTimeToBuyAndSellStocks1();
        //bestTimeToBuyAndSellStocks2();
        bestTimeToBuyAndSellStocks3();
    }

    static void bestTimeToBuyAndSellStocks1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] smax = new int[n];
        //populate suffix max array
        smax[n-1] = arr[n-1];
        for (int i = n-2; i >=0; i--) {
            smax[i] = Math.max(arr[i] , smax[i+1]);
        }
        int profit = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            profit = Math.max(profit, smax[i] - arr[i]);
        }
        System.out.println("The Profit is:- " + profit);
    }

    static void bestTimeToBuyAndSellStocks2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int profit = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > arr[i-1]) {
                profit += arr[i] - arr[i-1];
            }
        }
        System.out.println("The Maximum profit is:- " + profit);
    }

    static  void bestTimeToBuyAndSellStocks3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefixMin = new int[n];
        int[] suffixMax = new int[n];
        //populate prefixMin and suffixMax arrays
        prefixMin[0] = arr[0];
        suffixMax[n-1] = arr[n-1];
        for(int i=1; i<n;i++) {
            prefixMin[i] = Math.min(arr[i],prefixMin[i-1]);
        }
        for(int i=n-2;i>=0;i--) {
            suffixMax[i] = Math.max(arr[i],suffixMax[i+1]);
        }
        int ans = Integer.MIN_VALUE;
        int prevBest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            prevBest = Math.max(prevBest, arr[i] - prefixMin[i]);
            ans = Math.max(ans, prevBest + (suffixMax[i] - arr[i]));
        }
        System.out.println("The maximum profit is:- " + ans);
    }
}
