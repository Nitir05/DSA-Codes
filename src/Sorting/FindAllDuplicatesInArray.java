package Sorting;

import java.util.ArrayList;
import java.util.List;

/* https://leetcode.com/problems/find-all-duplicates-in-an-array/
*asked in amazon and microsoft
* */
public class FindAllDuplicatesInArray {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int i=0;
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr,i,correctIndex);
            }
            else
                i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
