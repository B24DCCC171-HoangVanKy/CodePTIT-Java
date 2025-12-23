
import java.util.Scanner;
public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long kq = 0;
        for(int j = 1; j <= n; j++) {
            kq += tongGiaiThua(j);
        }
        System.out.println(kq);
    }
    static long tongGiaiThua(int n){
        long sum = 1;
        for(int i = 1; i <= n; i++){
            sum *= i;
        }
        return sum;
    }
}
