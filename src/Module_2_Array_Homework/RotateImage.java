package Module_2_Array_Homework;

import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        rotateImage();
    }
    static void rotateImage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the Elements of an Array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        transposeMatrix(arr);
        for(int i=0; i<n; i++) {
            arr[i] = revereseArray(arr[i],0,arr[i].length - 1);
        }
        for(int row=0; row<n; row++) {
            for(int col=0; col<n; col++) {
                System.out.print(arr[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int[][] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static int[] revereseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
