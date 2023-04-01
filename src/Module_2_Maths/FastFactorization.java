package Module_2_Maths;

import java.util.Arrays;
import java.util.Scanner;

public class FastFactorization {
    public static void main(String[] args) {
        fastFactors();
    }
    /*
    *
    *
    *
    *
    * */

    static void fastFactors() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int[] primes = new int[n+1];
        int[] spf = new int[n+1];
        for (int i = 0; i <= n; i++) {
            primes[i] = 1;
            spf[i] = -1;
        }
        primes[1] = 0;
        for (int i = 2; i*i <=n ; i++) {
            if(primes[i] == 1) {
                for (int j = i; i*j <= n ; j++) {
                    if(primes[i*j] == 1) {
                        spf[i*j] = i;
                        primes[i*j] = 0;
                    }
                }
            }
        }
        while(spf[n] != -1) {
            System.out.println(spf[n]);
            n = n/spf[n];
        }
        if(n != 1) {
            System.out.println(n);
        }

    }

}
