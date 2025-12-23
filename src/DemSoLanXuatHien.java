

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[] numbers = new int[n];
            for (int j = 0; j < numbers.length; j++){
                numbers[j] = sc.nextInt();
            }
        }
    }
}
