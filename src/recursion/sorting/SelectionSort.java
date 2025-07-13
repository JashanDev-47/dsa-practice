package recursion.sorting;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[] arr = {1,210,20,2,5,3 };
        selectionSort(arr,1,0,0);
        System.out.println(Arrays.toString(arr));
    }



    /*private static void selectionSort(int[] arr, int idx, int minValue, int sortIdx) {

        if(sortIdx == arr.length  ) {
            return;
        }

        if(idx <= arr.length-1) {
//            Check For MIN
            if(arr[minValue] > arr[idx]) {
                minValue = idx;
            }
            selectionSort(arr,idx+1,minValue,sortIdx);
        } else {
            int temp = arr[sortIdx];
            arr[sortIdx] = arr[minValue];
            arr[minValue] = temp;
            selectionSort(arr,sortIdx+2,sortIdx+1,sortIdx+1);
        }

    }*/





    private static void selectionSort(int[] arr, int idx, int maxValue, int sortIdx) {

        if(sortIdx == 0 ) {
            return;
        }

        if(idx <= sortIdx) {
//            Check For MIN
            if(arr[maxValue] < arr[idx]) {
                maxValue = idx;
            }
            selectionSort(arr,idx+1,maxValue,sortIdx);
        } else {
            int temp = arr[sortIdx];
            arr[sortIdx] = arr[maxValue];
            arr[maxValue] = temp;
            selectionSort(arr,1,0,sortIdx-1);
        }

    }

}
