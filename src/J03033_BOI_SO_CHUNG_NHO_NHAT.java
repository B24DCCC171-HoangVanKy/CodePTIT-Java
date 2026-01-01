import java.math.BigInteger;
import java.util.Scanner;

public class J03033_BOI_SO_CHUNG_NHO_NHAT {
    static BigInteger gcd(BigInteger a, BigInteger b){
        if( b.equals(BigInteger.ZERO) ) return a;
        while(!(b.equals(BigInteger.ZERO))){
            BigInteger temp = a.remainder(b);
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.divide(gcd(a,b)).multiply(b));
        }
    }
}
