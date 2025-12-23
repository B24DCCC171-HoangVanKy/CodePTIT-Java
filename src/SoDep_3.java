

import java.util.Scanner;

public class SoDep_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String s = sc.nextLine();
            System.out.println(checkThuanNghich(s));
        }
    }
    static String checkThuanNghich(String s){
        int len = s.length();
        for(int i=0;i<len;i++){
            if (!(checkSnt(s.charAt(i)-'0'))) return "NO";
        }
        for (int j = 0, k = len - 1; j <= k; j++, k--) {
            char left = s.charAt(j);
            char right = s.charAt(k);
            if (left != right) return "NO";
        }
        return "YES";
    }
    static boolean checkSnt(int n){
        if (n < 2) return false;
        for (int i = 2; i * i <=n; i++ ){
            if (n % i ==0) return false;
        }
        return true;
    }
}
