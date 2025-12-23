

import java.util.Scanner;

public class SO47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n =  scan.nextLong();
        scan.nextLine();
        long dem = 0;

        while( n != 0) {
            long duoi = n % 10 ;
            n /= 10;
            if (duoi == 4 || duoi == 7){
                dem ++;
            }
        }
        if (dem == 4 || dem == 7 ){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        scan.close();

    }
}
