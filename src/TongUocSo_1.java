
import java.util.Scanner;

public class TongUocSo_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long t =  scan.nextLong();
        scan.nextLine();
        long kq = 0;

        for(long i = 0; i < t; i++){
            long n = scan.nextLong();
            kq += tongUoc(n);
        }
        System.out.println(kq);
    }
    static long tongUoc(long n) {
        long tong = 0;
        for (long i = 2; i * i <= n; i++){
            while (n % i == 0) {
                tong += i;
                n = n / i;
            }
        }
        if (n > 1 ){
            tong +=n;
        }
        return tong;
    }
}
