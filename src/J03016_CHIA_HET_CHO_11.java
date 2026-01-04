import java.math.BigInteger;
import java.util.Scanner;

public class J03016_CHIA_HET_CHO_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            if(a.remainder(new BigInteger("11")).equals(BigInteger.ZERO)){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}
