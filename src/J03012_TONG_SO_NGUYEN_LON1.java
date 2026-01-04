import java.math.BigInteger;
import java.util.Scanner;
public class J03012_TONG_SO_NGUYEN_LON1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            BigInteger n = new BigInteger(sc.next());
            BigInteger m = new BigInteger(sc.next());
            System.out.println(n.add(m));

        }
    }
}
