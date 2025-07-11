package recursion.arrays;

public class IsPresentLinear {


    public static void main(String[] args) {
        int[] arr = {1,2,3,14,24,42,12,32,9,8};
        boolean ans = isPresent(arr,42,0);
        System.out.println("The ans is : " + ans);

    }

    static boolean isPresent(int[] arr,int target,int idx) {
        if(idx == arr.length) {
            return false;
        }

        return arr[idx] == target || isPresent(arr,target,idx+1);

    }


}
