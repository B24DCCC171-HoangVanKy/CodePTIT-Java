import java.util.Scanner;

public class J02008_BOI_SO_NHO_NHAT_CUA_N_SO_NGUYEN_DUONG_DAU_TIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            long res = 1;
            for (int j = 2; j <= n; j++){
                res = lcm(res,j);
            }
            System.out.println(res);
        }

    }

    static long gcd(long a, long b){
        while(b!=0){
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static long lcm(long a, long b){
        return (a / gcd(a,b) * b);
    }
}
