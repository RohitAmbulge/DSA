// package Bit Magic;

public class countSetBit {

    public static int count(int n) {
        int res = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                res++;
            }
            n = n / 2;
        }
        return res;

    }

    public static void main(String[] args) {
        int n = 7;

        System.out.println(count(n));

    }

}
