package recursion.sorting;

import java.util.Arrays;

public class MergeHellper {

    static void manipulateOriginalArray(int[] arr,int[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            arr[i]  = newArray[i];
        }
    }

    public static void sortArray(int[] arr,int st,int stEnd,int mid,int end,int[] newArray,int idx) {
        if(st >= stEnd) {
            while(mid <= end) {
                newArray[idx++] = arr[mid++];
            }
            manipulateOriginalArray(arr,newArray);
            return;
        }

        if(mid > end) {
             while(st <= stEnd){
                newArray[idx++] = arr[st++];
            }
            manipulateOriginalArray(arr,newArray);
             return;
        }

        if(arr[st] > arr[mid]) {
            newArray[idx] = arr[mid];
            sortArray(arr,st,stEnd,mid+1,end,newArray,idx+1);
        } else {
            newArray[idx] = arr[st];
            sortArray(arr,st+1,stEnd,mid,end,newArray,idx+1);
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,4,8,1,2,3,9,10};
        sortArray(arr,0,3,3,arr.length-1,new int[arr.length],0);

        System.out.println(Arrays.toString(arr));
    }

}
