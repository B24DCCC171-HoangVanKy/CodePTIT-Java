

import java.util.Scanner;

public class CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for ( int i =0; i < t; i++){
            String s = sc.next();
            String ans = tachSo(s);
            System.out.println(ans);
        }
    }
    static String tachSo(String s){
        StringBuilder sb = new StringBuilder(s.length());
        for ( int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch (c){
                case '0', '8', '9' -> sb.append('0');
                case '1' -> sb.append('1');
                default -> {
                    return "INVALID";
                }
            }
        }
        int i = 0;
        while ( i < s.length() && sb.charAt(i) == '0'){
            i++;
        }
        if (i == s.length()){
            return "INVALID";
        }
        return sb.substring(i);
    }
}
