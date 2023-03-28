package Module_2_Maths;

import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        //checkIfPrimeOrNot();
        sieveOfEratosthenes();
    }

    static void checkIfPrimeOrNot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i * i <= n ; i++) {
            if(n%i == 0) {
                count++;
            }
        }
        if(count != 0) {
            System.out.println("Not Prime");
        }
        else {
            System.out.println("Prime");
        }
    }

    static void sieveOfEratosthenes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Boolean[] prime = new Boolean[n+1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }
        for (int p = 2; p * p <= n ; p++) {
            if(prime[p] == true) {
                for (int i = p*p; i  <= n ; i+=p) {
                    prime[i] = false;
                }
            }
        }

        for (int i = 2; i <= n ; i++) {
            if(prime[i] == true){
                System.out.println(i + " ");
            }
        }

    }
}
