package Sorting;

import java.util.Arrays;

/*
* https://leetcode.com/problems/find-the-duplicate-number/
* asked in Amazon,Microsoft
*/
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int ans = findDuplicate(arr);
        System.out.println(ans);

    }
    public static int findDuplicate(int[] arr) {
        int i=0;
        while(i< arr.length) {
            if(arr[i] != i+1){
                int correctIndex = arr[i] - 1;
                if(arr[i] != arr[correctIndex]) {
                    swap(arr,i,correctIndex);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
