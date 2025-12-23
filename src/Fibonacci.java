

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(Fib(n));
        }
    }
    static long Fib(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        long fn = 0;
        long f_2 = 0;
        long f_1 = 1;
        for (long i = 2; i <= n; i++) {
            fn =  f_1 + f_2;
            f_2 = f_1;
            f_1 = fn;

        }
        return fn;
    }
}
