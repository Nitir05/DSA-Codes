package Module_2_Maths;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        //euclidsDivisionLemma();
        //computeGCDOfMultipleNums();
        checkIfGCDIs1();
    }

    static void euclidsDivisionLemma() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number for which you want to find GCD");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        if(min == 0 ) {
            System.out.println("GCD is: " + max);
        }
        else {
            int gcd = GCD(max,min);
            System.out.println("GCD is: " + gcd);
        }
    }

    static void computeGCDOfMultipleNums() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the size of an Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Math.max(arr[0],arr[1]);
        int min = Math.min(arr[0],arr[1]);
        int gcd = 0;
        gcd = GCD(max,min);
        for (int i = 2; i < n; i++) {
            gcd = GCD(gcd, arr[i]);
        }
        System.out.println("GCD is: " + gcd);
    }

    static void checkIfGCDIs1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Math.max(arr[0],arr[1]);
        int min = Math.min(arr[0],arr[1]);
        int gcd = 0;
        gcd = GCD(max,min);
        for (int i = 2; i < n; i++) {
            gcd = GCD(gcd, arr[i]);
        }
        if(gcd == 1)
            System.out.println("True");
        else
            System.out.println("False");

    }

    static int GCD(int max, int min) {
        while(max%min !=0) {
            int temp = max;
            max = min;
            min = temp % min;
        }
        return min;
    }
}
