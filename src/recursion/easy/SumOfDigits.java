package recursion.easy;

public class SumOfDigits {

    public static void main(String[] args) {
        int ans = sumOfDigits(12434);
        System.out.println("The ans is : " +ans);
    }

    static int sumOfDigits (int n) {
        if(n < 10) {
            return n;
        }

        int curr = n % 10;
        return curr + sumOfDigits(n/10);

    }

}
