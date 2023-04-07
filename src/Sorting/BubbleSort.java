package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        boolean swapped = false;
        ///run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            //for each step max item will come at last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than previous item
                if(arr[j] < arr[j-1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            //check after checking each number for particular value of i if swapping occured or not
            if(!swapped)
                break;
        }
    }
}
