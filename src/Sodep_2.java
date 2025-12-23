

import java.util.Scanner;

public class Sodep_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine().trim();
            System.out.println(check(s));
        }
    }
    public static String check(String s) {
        if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') return "NO";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        if(sum % 10 != 0 )  return "NO";
        for (int i = 0; i < s.length() / 2; i++) {
            char left = s.charAt(i);
            char right = s.charAt(s.length() - 1 - i);
            if (left != right) return "NO";
        }
        return "YES";
    }
}
