

import java.util.Scanner;

public class TinhLuyThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if ( a == 0 && b == 0){
                break;
            }
            System.out.println(tinhLuyThua(a,b));
        }

    }
    static long tinhLuyThua(long a, long b){
        long res = 1;
        long mod = 1000000007;
        if(b == 0) return 1;
        while(b != 0 ){
            if (b % 2 == 1) {
                res *= a;
                res = res % mod;
            }
            a = (a*a) / mod;
            b /= 2;
        }
        return res;

    }

}
