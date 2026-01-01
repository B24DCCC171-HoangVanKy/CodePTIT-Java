package KhaiBaoClass;

import java.util.Scanner;

public class J04005_KHAI_BAO_LOP_THI_SINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String date = sc.nextLine();
        float p1 = sc.nextFloat();
        float p2 = sc.nextFloat();
        float p3 = sc.nextFloat();
        float res = p1 +  p2 + p3;

        System.out.printf("%s %s %.1f", name,date,res);

    }
}
