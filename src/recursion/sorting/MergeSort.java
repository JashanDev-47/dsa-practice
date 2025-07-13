package recursion.sorting;

import java.util.Arrays;

import static recursion.sorting.MergeHellper.sortArray;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 1, 2, 5, 6};
        int[] ans = mergeSort(arr, 0, arr.length - 1);

        System.out.println("The array is : " + Arrays.toString(ans));
    }


    public static int[] mergeSort(int[] arr, int st, int end) {


        if (st == end) {
            return new int[]{arr[st]};
        }
        int mid = st + (end - st) / 2;
        int[] arr1 = mergeSort(arr, st, mid);
        int[] arr2 = mergeSort(arr, mid + 1, end);

        return sortTwoArray(arr1, arr2);

    }


    public static int[] sortTwoArray(int[] arr1, int[] arr2) {
        int firstIdx = 0;
        int secondIdx = 0;
        int[] ans = new int[arr1.length + arr2.length];
        int idx = 0;
        while (firstIdx < arr1.length && secondIdx < arr2.length) {
            if (arr1[firstIdx] > arr2[secondIdx]) {
                ans[idx] = arr2[secondIdx];
                secondIdx++;
            } else {
                ans[idx] = arr1[firstIdx];
                firstIdx++;
            }
            idx++;
        }



        while (secondIdx < arr2.length) {
            ans[idx] = arr2[secondIdx];
            secondIdx++;
            idx++;
        }

        while (firstIdx < arr1.length) {
            ans[idx] = arr1[firstIdx];
            firstIdx++;
            idx++;
        }


        return ans;
    }


}
