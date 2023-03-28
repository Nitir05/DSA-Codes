package Module_2_Maths;

import java.util.Scanner;

public class OpenCloseProblem {
    public static void main(String[] args) {
        solution();
    }

    static void solution() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int x = (int) Math.sqrt(n);
        System.out.println(x + " doors will be opened in the end");
    }
}
