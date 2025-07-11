package recursion.easy;

public class EasyPractice {

    public static void main(String[] args) {
        int ans = fibonacci(8);
        System.out.println("The ans is : " + ans);
    }

    public static int fibonacci(int n) {
        if( n <= 2 ) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
