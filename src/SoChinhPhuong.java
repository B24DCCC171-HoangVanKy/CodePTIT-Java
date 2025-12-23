

import java.util.Scanner;

public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i =0; i < t; i++){
            int n = sc.nextInt();
            int can = (int) Math.sqrt((double)n);
            String res = (can * can == n) ? "YES" : "NO";
            System.out.println(res);
        }
    }
}
