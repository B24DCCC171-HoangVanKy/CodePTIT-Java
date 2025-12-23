

import java.util.Scanner;

public class CheckFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            long n = sc.nextLong();
            if (checkFibo(n)) {
                System.out.println("YES");
            }
            else  {
                System.out.println("NO");
            }
        }
    }
    static boolean checkFibo(long n){
        long f2 = 0;
        long f1 = 1;
        long fn = 0;
        if (n == 0 || n == 1) return true;
        for (long i = 2; i <= 92; i++){
            fn = f2 + f1;
            if (fn == n) return true;
            f2 = f1;
            f1 = fn;
        }
        return false;
    }
}
