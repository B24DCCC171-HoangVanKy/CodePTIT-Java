import java.util.Scanner;
import java.math.BigInteger;
public class J03015_HIEU_SO_NGUYEN_LON2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         BigInteger a = new BigInteger(sc.next());
         BigInteger b = new BigInteger(sc.next());
         BigInteger res = a.subtract(b);
        System.out.println(res);
    }
}
