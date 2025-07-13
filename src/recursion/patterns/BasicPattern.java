package recursion.patterns;

public class BasicPattern {

    public static void main(String[] args) {
        printStars(4,0 );
    }

    static void printStars(int n,int row) {
        if(n == 0 ) {
            return;
        }

        if(row < n) {
            printStars(n,row+1);
            System.out.print("*");
        } else {
            printStars(n-1,0);
            System.out.println();
        }

    }

}
