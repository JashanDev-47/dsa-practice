public class NoOfDigits {

    public static void main(String[] args) {
        int n = 6;
        int b = 2;
        int digits = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println("The no of digits base : "+ b + " : " + digits);

    }
}
