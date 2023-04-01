package Module_2_Recursion;

public class RecursionTreeDiagram {
    public static void main(String[] args) {
        function(0);
    }
    static void function(int x) {
        System.out.println(x);
        if(x >=3) {
            return;
        }
        function(x+1);
        function(x+2);
    }
}
