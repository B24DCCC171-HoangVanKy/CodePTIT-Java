

import java.util.Scanner;

public class Ucln_Bcnn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long Bcnn = a * b / Ucln(a,b);
            System.out.println(Bcnn + " " + Ucln(a,b));
        }
    }
    public static long Ucln(long a, long b) {
        if (a < b) {
            long temp = a;
            a = b;
            b = temp;
        }
        while(b != 0) {
            long chia = a % b;
            a = b;
            b = chia;
        }
        return a;
    }
}
