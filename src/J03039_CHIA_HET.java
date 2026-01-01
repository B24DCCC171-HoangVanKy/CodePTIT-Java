import java.math.BigInteger;
import java.util.Scanner;

public class J03039_CHIA_HET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            String b = sc.next();

            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(b);

            if(x.remainder(y).equals(BigInteger.ZERO) || y.remainder(x).equals(BigInteger.ZERO) ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
