

import java.util.Scanner;

public class SapXepChon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int dem = 0;
        for (int i = 0; i < n - 1; i++) {
            int pos_min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[pos_min]) {
                    pos_min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos_min];
            arr[pos_min] = temp;
            dem++;
            System.out.print("Buoc " + dem + ": " );
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
