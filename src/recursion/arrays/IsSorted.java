package recursion.arrays;

public class IsSorted {

    public static void main(String[] args) {

        int[] arr = {2,3,6,8,19,20,30,34,45,55};
//        int[] arr = {2,1};
        boolean ans = isSorted(arr,0);

        System.out.println("The arr is sorted : " + ans);

    }

    static boolean isSorted(int[] arr,int i) {
        if(i == arr.length - 1) {
            return true;
        }

        return arr[i] < arr[i+1] && isSorted(arr,i+1);
    }



}
