

import java.util.Scanner;

public class UocSoNTLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        sc.nextLine();

        for (long j = 0; j < t; j++) {
            long n = sc.nextLong();
            System.out.println(UocSoNTLonNhat(n));
        }
    }
    static long UocSoNTLonNhat(long n){
        long max = 1;

        for (long i = 2; i * i <=n; i++){
            while(n % i == 0) {
                if(i > max){
                    max = i;
                }
                n /= i;
            }
        }
        if(n > 1){
            max = n;
        }
        return max;
    }
}


