package Module_2_Maths;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        primeFactors();
    }
    /*
    * Run the loop from 2 to sqrt(n)
    * check if the number is divisible by i and print the factor
    * divide the number by i in the process
    * after the for loop check if i is not equal to 1
    * if true print n as it is prime number as well
    * T.C = O(sqrt(n))
    */
    static void primeFactors() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int num = n;
        /*Optimized approach*/
        for (int i = 2; i * i <= num ; i++) {
            while(n % i == 0) {
                System.out.println(i);
                n = n/i;
            }
        }
        if(n != 1) {
            System.out.println(n);
        }
    }
}
