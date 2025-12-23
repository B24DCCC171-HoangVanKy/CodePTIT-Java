
import  java.util.Scanner;
public class snt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (checkSnt(n)) {
                System.out.println("YES");
            }
            else  {
                System.out.println("NO");
            }
        }
    }
    static boolean checkSnt( int x){
        if (x < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(x) + 1; i++) {
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
