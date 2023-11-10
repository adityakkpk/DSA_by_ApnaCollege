package Recursion;

public class I_IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isSortedArray(arr, 0));
    }

    public static boolean isSortedArray(int[] arr, int idx){
        if(idx==arr.length-1){
            return true;
        }

        // if(arr[idx] < arr[idx+1]){
        //     //array is sorted till now
        //     return isSortedArray(arr, idx+1);
        // }else{
        //     return false;
        // }

        if(arr[idx] >= arr[idx+1]){
            return false;
        }

        return isSortedArray(arr, idx+1);
    }
}
