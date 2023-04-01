package Module_2_Array;

import java.util.Scanner;

public class slidingWindowTechnique {
    public static void main(String[] args) {
        //printSumOfEverySubArray();
        findFrequency();
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
        System.out.println("The Sum of all sub-arrays are");
        for (int i = k; i <= n-1; i++) {
            System.out.println(sum);
            sum += arr[i];
            sum -= arr[i-k];
        }
        System.out.println(sum);
    }

    static void findFrequency() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of an Array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of window");
        int k = sc.nextInt();
        System.out.println("Enter the number to find the frequency");
        int x = sc.nextInt();
        int count = 0;
        //find the frequency in first window
        for (int i = 0; i < k; i++) {
            if(arr[i] == x){
                count++;
            }
        }
        //find frequency in rest of the windows
        for (int i = k; i < n; i++) {
            if(arr[i] == x) {
                count++;
            }
            if(arr[i-k] == x) {
                count--;
            }
        }
        System.out.println(x + " appeared " + count + " times");

    }
}
