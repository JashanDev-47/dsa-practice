import java.math.BigDecimal;

public class findSqrt {


    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.printf("The square root of %d is : %.3f",n,sqrt(n,p));
        System.out.println();
        System.out.println("Newons method : " + newtonSqrt(40));
    }


    static float sqrt(int n,int p) {

        int st = 0;
        int end = n;
        float root = 0.0f;
        while(st <= end) {
            int mid = st + ( end - st ) / 2;

            if(mid * mid == n) {
                return mid;
            }
            else if(mid * mid < n) {
                st = mid + 1;
                root = mid;
            }
            else {
                end = mid - 1;
            }

        }

        float incr = 0.1f;
        for (int i = 0; i < p; i++) {
            while(root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;

        }
        return root;
    }

    static float newtonSqrt(float n) {
        float root = 0.0f;
        float x = n;

        while(true) {
            root =(float) 0.5 * (x + (n/x));

            if(Math.abs(root - x) <= 0.011) {
                break;
            }
            x = root;
        }
        return root;
    }
}
