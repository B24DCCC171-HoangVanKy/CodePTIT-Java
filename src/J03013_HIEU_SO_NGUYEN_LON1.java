import java.util.Scanner;
import java.math.BigInteger;

public class J03013_HIEU_SO_NGUYEN_LON1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            String b = sc.next();

            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(b);

            BigInteger hieu = x.subtract(y).abs();
            String lenHieu = hieu.toString();

            int maxLen = (a.length() > b.length()) ? a.length() : b.length();

            while(lenHieu.length() < maxLen){
                lenHieu = "0" + lenHieu;
            }

            System.out.println(lenHieu);
        }

    }
}
