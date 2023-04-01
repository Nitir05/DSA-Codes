package Module_2_Recursion;

import java.util.Scanner;

public class PrintFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //print(1,n);
        printReverse(n);
    }
    static void print(int x, int n) {
        if(x > n)
            return;
        System.out.print(x + " ");
        print(x+1,n);
    }

    static void printReverse(int n) {
        if(n == 0)
            return;
        System.out.print(n + " ");
        printReverse(n-1);
    }
}
