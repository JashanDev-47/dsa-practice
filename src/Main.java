


public class Main {


    public static void main(String[] args) {
        int n = 52;
        int ans = rightMostSetBit(n);
        System.out.println("The ans is : " + ans);
    }

    private static int rightMostSetBit(int n) {
        int bitmask = ~n + 1;

        return n & bitmask;
    }
}