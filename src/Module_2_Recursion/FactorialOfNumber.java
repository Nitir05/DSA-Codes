package Module_2_Recursion;

public class FactorialOfNumber {


    public static void main(String[] args) {
        System.out.println(factors(10));
    }

    static int factors(int n) {
        if(n == 1)
            return 1;
        return n * factors(n-1);

    }
}
