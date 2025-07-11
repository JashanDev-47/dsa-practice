package recursion.easy;

public class CountZeros {

    public static void main(String[] args) {
        int ans = countZerosInN(3020030,0);
        System.out.println("The ans is : " + ans);
    }


    static int countZerosInN(int n,int count) {
        if(n==0) {
            return count;
        }
        int rem = n % 10;
        if(rem == 0) {
            return countZerosInN(n/10,count+1);
        }
        return countZerosInN(n/10,count);

    }

}
