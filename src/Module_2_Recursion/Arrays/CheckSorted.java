package Module_2_Recursion.Arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int [] arr = {1,3,0,6,8};
        System.out.println(checkSorted(arr,0));
    }

    static boolean checkSorted(int[] arr, int index) {
        //base condition
        if(index == arr.length -1)
            return true;
        return arr[index] < arr[index+1] && checkSorted(arr,index+1);
    }
}
