

import java.util.Scanner;

public class SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if(check(n)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    static boolean check(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        boolean isTrue = true;
        for(char num : arr){
            if(num != '0' && num != '1' && num != '2' ){
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
}
