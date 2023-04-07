package Module_2_Recursion.Arrays;

public class RotatedBinarysearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,0,0,arr.length-1));
    }

    static int search(int[] arr,int target, int s, int e) {
        if(s > e)
            return -1;
        int m = s + (e-s)/2;
        if(arr[m] == target)
            return m;
        //check if the left section is sorted
        if(arr[s] <= arr[m]){
            //check if target lies on left side of array
            if(target >= arr[s] && target <= arr[m]) {
                return search(arr,target,s,m-1);
            }
            //target lies on right side of array
            else{
                return search(arr,target, m+1,e);
            }
        }
        //target lies on right side of array
        if(target >= arr[m] && target <= arr[e]) {
            return search(arr,target, m+1,e);
        }
        return search(arr,target, s,m-1);
    }
}
