package Module_2_Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,4,4,9};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search(arr,10,0));
        System.out.println(searchIndex(arr,18,0));
        System.out.println(searchIndexLast(arr,3,arr.length-1));
        System.out.println(searchAllIndex(arr,4,0,list));
        System.out.println(searchAllIndexWithouArg(arr,4,0));
    }
    static boolean search(int[] arr, int target, int index) {
        if(index > arr.length-1)
            return false;
        if(arr[index] == target)
            return true;
        return search(arr,target,index+1);
    }

    static int searchIndex(int[] arr,int target, int index) {
        if(index == arr.length)
            return -1;
        if(arr[index] == target)
            return index;
        else
            return searchIndex(arr,target,index+1);
    }

    static int searchIndexLast(int[] arr, int target, int index) {
        if(index == -1)
            return -1;
        if(arr[index] == target)
            return index;
        else
            return searchIndexLast(arr, target, index - 1);
    }
    static ArrayList searchAllIndex(int[] arr, int target, int index,ArrayList<Integer> list) {
        if(index == arr.length)
            return list;
        if(arr[index] == target)
            list.add(index);
        return searchAllIndex(arr,target,index+1,list);
    }

    static ArrayList searchAllIndexWithouArg(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
            return list;
        if(arr[index] == target)
            list.add(index);
        ArrayList<Integer> listFromBelow = searchAllIndexWithouArg(arr,target,index+1);
        list.addAll(listFromBelow);
        return list;
    }

}
