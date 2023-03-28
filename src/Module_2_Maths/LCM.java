package Module_2_Maths;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
       // findLCM();
       // findLCMMultiple();
        divisibleByAandB();
    }

    static void findLCM() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = a * b;
        int gcd = GCD(Math.max(a,b), Math.min(a,b));
        int lcm = prod / gcd;
        System.out.println("LCM is: " + lcm);
    }

    static void findLCMMultiple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter size of an Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int prod = arr[0] * arr[1];
        int gcd = GCD(Math.max(arr[0],arr[1]),Math.min(arr[0],arr[1]));
        int lcm = prod / gcd;
        for (int i = 2; i < n; i++) {
            prod = lcm * arr[i];
            gcd = GCD(Math.max(lcm, arr[i]),Math.min(lcm,arr[i]));
            lcm = prod / gcd;
        }
        System.out.println("LCM: " + lcm);
    }

    static void divisibleByAandB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of an Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] % a == 0) {
                countA++;
            }
            if(arr[i] % b == 0) {
                countB++;
            }
        }
        int prod = countA * countB;
        int gcd = GCD(Math.max(countA,countB),Math.min(countA,countB));
        int lcm = prod / gcd;
        int expression = n/countA + n/countB - n/lcm;
        System.out.println("The ans is: " + expression);
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
