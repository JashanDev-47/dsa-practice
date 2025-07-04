public class FastExponential {
    public static void main(String[] args) {
        System.out.println("The power  is : " + fastExponential(3,5));

    }


    static int fastExponential(int n,int p) {
        int ans = 1;
        int base = n;

        while(p != 0) {
            int curr = p & 1;
            if(curr == 1) {
                ans = base * ans;
            }
            base = base * base;
            p = p>>1;
        }
        return ans;
    }
}


