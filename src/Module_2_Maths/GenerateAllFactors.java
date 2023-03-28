package Module_2_Maths;

import java.util.Scanner;

public class GenerateAllFactors {

    public static void main(String[] args) {
        //generate();
        checkEvenOddFactors();
    }

    static void generate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n)
                    System.out.println(i);
                else {
                    System.out.println(i);
                    System.out.println(n / i);
                }
            }
        }
    }

    static void checkEvenOddFactors() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        double val = Math.sqrt(n);
        if(val * val == n) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
