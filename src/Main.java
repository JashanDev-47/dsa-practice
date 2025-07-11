


public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7,8,9,10,11,12,0, 1, 2};
        System.out.println(findPivotRecursion(arr,11,0,arr.length-1));
    }


    static int findPivotRecursion(int[] arr,int target,int st ,int end) {

        if(st > end) {
            return -1;
        }

        int mid = st + (end - st) / 2;

        if(arr[mid] == target ) {
            return mid;
        }

        if(arr[mid] >= arr[st]) {
//            Array Is Sorted From Start Till mid
            if(target <= arr[mid] && target >= arr[st]) {
                return findPivotRecursion(arr,target,st,mid-1);
            } else {
                return findPivotRecursion(arr,target,mid+1,end);
            }
        } else {
//            Array Is Sorted From mid till end
            if(target >= arr[mid] && target <= arr[end]) {
                return findPivotRecursion(arr,target,mid+1,end);
            } else{
                return findPivotRecursion(arr,target,st,mid-1);
            }
        }

    }

    static int findPivotIdxIteration(int[] arr) {
       int st = 0;
       int end = arr.length - 1;

       int pivotIdx = -1;
       while(st <= end) {
           int mid = st + (end - st) / 2;
           if(arr[mid] > arr[st] && arr[mid] > arr[end]) {
//               It can be Pivot
               pivotIdx = mid;
               st = mid;
           }
           else if(arr[mid] > arr[end]) {
               end = mid;
           } else {
               st = mid + 1;
           }

       }
       return pivotIdx;
    }

}