

import java.util.Scanner;

public class SoKhongLienKe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i = 0; i < t; i++){
            long n = scan.nextLong();
            int len = String.valueOf(n).length();
            int[] numbers = new int[len];
            int tong = 0;
            for (int j = len -1; j >= 0; j--){
                int duoi =(int) n % 10;
                tong += duoi;
                numbers[j] = duoi;
                n /= 10;
            }
            if (tong % 10 ==0 && checkKhoangCach(numbers)) {
                System.out.println("YES");
            }else  {
                System.out.println("NO");
            }
        }
    }
    static boolean checkKhoangCach(int[] number) {

        for (int i = 0; i < number.length - 1; i++) {
            if(Math.abs(number[i] - number[i+1]) != 2){
                return false;
            }
        }
        return true;
    }
}
