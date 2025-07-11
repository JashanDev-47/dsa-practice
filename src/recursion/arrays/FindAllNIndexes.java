package recursion.arrays;

import java.util.ArrayList;

public class FindAllNIndexes {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 8};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findNInArr(arr, 4, 0,list);
        System.out.println("The ans is : " + list);
    }


    static ArrayList<Integer> findNInArr(int[] arr, int target, int idx, ArrayList<Integer> list) {
        if(idx == arr.length) {
            return list;
        }
        if(arr[idx] == target) {
            list.add(idx);
        }
        return findNInArr(arr,target,idx+1,list);
    }


    /*static ArrayList<Integer> findNInArr(int[] arr, int target, int idx) {
        ArrayList<Integer> list = new ArrayList<>();
        if (idx == arr.length) {
            return list;
        }

        if (arr[idx] == target) {
            list.add(idx);
        }
        list.addAll(findNInArr(arr, target, idx + 1));
        return list;
    }*/


}
