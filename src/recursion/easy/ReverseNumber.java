package recursion.easy;

public class ReverseNumber {


    public static void main(String[] args) {
        int ans = reverse(184);
        System.out.println("The ans is : " + ans);
    }

    static int reverse(int n) {
        if(n < 10) {
            return n;
        }

        int digits = (int) Math.log10(n);
        System.out.println("The digits are : " + digits);
        int power =(int) Math.pow(10,digits);

        return reverse(n/10) + (power*(n%10));

    }

}
