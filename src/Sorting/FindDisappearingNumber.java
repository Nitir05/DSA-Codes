package Sorting;

import java.util.ArrayList;
import java.util.List;

/*
*  https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
* asked in Google
*/

public class FindDisappearingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(arr);
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
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
                ans.add(j+1);
            }
        }
        System.out.println(ans);
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
