import java.util.Scanner;

public class CatDoi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String s = sc.next().trim();   // mỗi test là 1 token số
            String ans = cutHalf(s);
            System.out.println(ans);
        }
    }

    static String cutHalf(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '8' || c == '9') sb.append('0');
            else if (c == '1')                    sb.append('1');
            else                                   return "INVALID";
        }

        // bỏ mọi '0' ở đầu kết quả
        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') i++;

        // nếu toàn 0 sau ánh xạ → INVALID
        if (i == sb.length()) return "INVALID";

        return sb.substring(i);
    }
}
