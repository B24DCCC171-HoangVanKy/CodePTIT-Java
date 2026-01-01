import java.util.Scanner;

public class J03021_DIEN_THOAI_CUC_GACH {
    static char swingChar(char c) {
//        switch(c){
//            case 'a', 'b', 'c': return '2';
//            case 'd', 'e', 'f': return '3';
//            case 'g', 'h', 'i': return '4';
//            case 'j', 'k', 'l': return '5';
//            case 'm', 'n', 'o': return '6';
//            case 'p', 'q', 'r', 's': return '7';
//            case 't', 'u', 'v': return '8';
//            case 'w', 'x', 'y','z': return '9';
//            default: return ' ';
//        }
        String[] keys = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].indexOf(c) != -1) {
                return (char) (i + 2);
            }
        }
        return ' ';
    }

    static boolean checkThuanNgich(String s){
        StringBuilder res =  new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            res.append(swingChar(s.charAt(i)));
        }
        String original = res.toString();
        String rev = res.reverse().toString();
        return (original.equals(rev));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            System.out.println(checkThuanNgich(s) ? "YES" : "NO");
        }
    }

}
