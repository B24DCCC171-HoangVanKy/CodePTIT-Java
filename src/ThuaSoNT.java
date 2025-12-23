

import java.util.Scanner;

public class ThuaSoNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.printf("Test %d: ",i+1);
            ptThuaSoNT(n);
            System.out.println();
        }
    }
    static void ptThuaSoNT(int n){
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                int dem = 0;
                while(n % i == 0){
                    dem++;
                    n /= i;
                }
                System.out.printf("%d(%d) ", i, dem);
            }
        }
        if (n > 1) {
            System.out.printf("%d(1) ", n);
        }

    }
}
