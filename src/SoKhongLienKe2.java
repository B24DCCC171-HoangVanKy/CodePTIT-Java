

import java.util.Scanner;

public class SoKhongLienKe2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        if (kiemTraSo(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    // Hàm kiểm tra riêng
    static boolean kiemTraSo(long n) {
        int sum = 0, prev = -1;
        while (n > 0) {
            int d = (int) (n % 10);
            sum += d;
            if (prev != -1 && Math.abs(d - prev) != 2) return false; // return sớm
            prev = d;
            n /= 10;
        }
        return sum % 10 == 0;
    }

}
