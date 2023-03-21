package Module_2_Array;

import java.util.Scanner;

public class MaximumChunks {
    public static void main(String[] args) {
        maxChunksToMakeSorted();
    }

    static void maxChunksToMakeSorted() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //Initialize Prefix-Max Array
        int[] pmax = new int[n];
        //populate prefix-max array
        pmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pmax[i] = Math.max(pmax[i-1],arr[i]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(pmax[i] == i) {
                count++;
            }
        }
        System.out.println("The maximum chunks on which this array can be sorted is:- " + count);
    }
}
