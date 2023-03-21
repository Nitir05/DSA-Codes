package Module_2_Array;

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        rainWaterTrapping();
    }

    static void rainWaterTrapping() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //Initialise Prefix-Max and Suffix-Max Array
        int[] pmax = new int[n];
        int[] smax = new int[n];
        //populate Prefix-Max and Suffix-Max Array
        pmax[0] = arr[0];
        smax[n-1] = arr[n-1];
        for (int i = 1; i < n; i++) {
            pmax[i] = Math.max(pmax[i-1],arr[i]);
        }
        for (int i = n-2; i >= 0 ; i--) {
            smax[i] = Math.max(smax[i+1],arr[i]);
        }
        int amount = 0;
        //calculate the amount of water being stored
        for (int i = 1; i < n-1; i++) {
            int dh = Math.min(pmax[i-1],smax[i+1]); //deciding height
            if(dh > arr[i]){
                amount += dh - arr[i];
            }
        }
        System.out.println("The total amount of water being stored is:- " + amount);
    }
}
