package Module_2_Array;

import java.util.Scanner;

public class slidingWindowTechnique {
    public static void main(String[] args) {
        printSumOfEverySubArray();
    }
    static void printSumOfEverySubArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an Array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of window");
        int k = sc.nextInt();
        int sum = 0;
        //calculate sum of first window
        for (int i = 0; i <= k-1; i++) {
            sum += arr[i];
        }
        //calculate sum of rest of the windows
        for (int i = k; i <= n-1; i++) {
            System.out.println(sum);
            sum += arr[i];
            sum -= arr[i-k];
        }
        System.out.println(sum);
    }
}
