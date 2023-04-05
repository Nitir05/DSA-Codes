package Module_2_Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(13020230));
    }

    public static int count(int n) {
        return helper(n,0);
    }

    //special pattern, how to return same value to above function calls
    static int helper(int n, int c) {
        if(n==0) {
            return c;
        }
        int rem = n % 10;
        if(rem ==0)
            return helper(n/10, c+1);
        return helper(n/10,c);
    }
}
