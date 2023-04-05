package Module_2_Recursion;

public class Digits {
    public static void main(String[] args) {
        System.out.println(prodOfDigits(432));
    }

    static int sumOfDigits(int n) {
        if(n == 0)
            return 0;
        return n%10 + sumOfDigits(n/10);
    }

    static int prodOfDigits(int n) {
        if(n%10 == n)
            return n;
        return n%10 * prodOfDigits(n/10);
    }
}
