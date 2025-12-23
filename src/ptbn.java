
import java.util.Scanner;
public class ptbn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double nghiem = -b/a;

        if(a == 0 && b > 0) {
            System.out.println("VN");
        }else if(a == 0 && b == 0)  {
            System.out.println("VSN");
        }else {
            System.out.printf("%.2f", nghiem);
        }
    }
}
