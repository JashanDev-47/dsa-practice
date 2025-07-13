package recursion.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,2,1,4,6,5};
        sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int idx,int sortIdx) {

        if(sortIdx == 0) {
            return;
        }

        if(idx < sortIdx) {
            if(arr[idx] > arr[idx+1]) {
                int temp = arr[idx];
                arr[idx] = arr[idx+1];
                arr[idx+1] = temp;
            }
            sort(arr,idx+1,sortIdx);
        } else {
            sort(arr,0,sortIdx - 1);
        }



    }

}
