package recursion.arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        int ans = search(arr,18,0);
        System.out.println("The ans is  : " + ans);

    }

    static int search(int[] arr,int target,int idx) {
        if(idx  == arr.length ) {
            return -1;
        }
        if(arr[idx] == target) {
            return idx;
        }

        return search(arr,target,idx+1);
    }

}
