

import java.util.Scanner;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            String[] arr = s.split(" ");
            for(String str : arr){
                sb1.append(str).reverse();
                sb2.append(sb1 + " ");
                sb1.delete(0, sb1.length());
            }
            System.out.println(sb2.toString());
        }
    }
}
