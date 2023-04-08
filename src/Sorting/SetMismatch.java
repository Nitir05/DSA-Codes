package Sorting;

import java.util.Arrays;

/*
* https://leetcode.com/problems/set-mismatch/
* */
public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,1};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr,i,correctIndex);
            }
            else
                i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1) {
                return new int[] {arr[j],j+1};
            }
        }
        return new int[] {};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
