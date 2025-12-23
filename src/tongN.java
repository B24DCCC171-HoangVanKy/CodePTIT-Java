
import java.util.Scanner;
public class tongN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            System.out.println(n * (n + 1) / 2);
        }

    }
}
