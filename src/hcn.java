
import java.util.Scanner;

public class hcn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chieuDai = scanner.nextInt();
        int chieuRong = scanner.nextInt();
        int dienTich = chieuDai * chieuRong;
        int chuVi = (chieuDai + chieuRong) * 2;

        if(chieuDai > 0 && chieuRong > 0) {
            System.out.println(chuVi + " " + dienTich);
        }else {
            System.out.println(0);
        }
    }
}
