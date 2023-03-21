package Module_2_Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        rotateArrayByK();
    }

    public static void rotateArrayByK() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        if(k>n)
            k%=n;
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr,int low, int high) {
        while(low< high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
