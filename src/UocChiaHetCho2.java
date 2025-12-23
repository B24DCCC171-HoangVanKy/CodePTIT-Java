


import java.util.ArrayList;

import java.util.Scanner;

public class UocChiaHetCho2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < t; i++) {
            ArrayList<Integer> result = new ArrayList<>();
            int n = scan.nextInt();
            int dem = 0;

            for (int j = 1; j * j <= n; j++ ){
                if(n % j == 0){
                    if(n / j != j) {
                        result.add(j);
                        result.add(n / j);
                    }else {
                        result.add(j);
                    }
                }
            }
            for (int num : result) {
                if (num % 2 == 0) {
                    dem++;
                }
            }
            System.out.println(dem);
        }

    }

}
