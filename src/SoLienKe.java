

import java.util.Scanner;

public class SoLienKe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < t; i++) {
            long n = scan.nextLong();
            int len = String.valueOf(n).length();
            long[] numbers = new long[len];
            boolean check = true;

            for ( int j = len - 1; j >=0 ; j--) {
                numbers[j] = n % 10;
                n /= 10;
            }
            for (int k = 0; k < len -1; k++){
                if(Math.abs(numbers[k] - numbers[k +1]) != 1  ){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
