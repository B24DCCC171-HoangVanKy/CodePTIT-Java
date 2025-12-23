

import java.util.Scanner;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        int[] count = new int[256];
        int dem = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') { // chỉ đánh dấu chữ cái thường
                count[c] = 1;
            }
        }

        for (int i = 'a'; i <= 'z'; i++) { // chỉ duyệt từ a → z
            if (count[i] != 0) {
                dem++;
            }
        }

        System.out.println(dem);
    }
}
