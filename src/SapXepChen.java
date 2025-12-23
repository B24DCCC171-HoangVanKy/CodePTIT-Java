

import java.util.Scanner;

public class SapXepChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Buoc 0" + ": " + arr[0]);
        System.out.println();
        int dem = 1;
        // Code thuat toan sap xep
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int pos = i - 1;
            while(pos >= 0 && key <= arr[pos]){
                arr[pos+1] = arr[pos];
                pos--;
            }
            arr[pos+1] = key;
            System.out.print("Buoc " + dem + ": ");
            for( int j = 0; j <= i; j++ ){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
            dem++;
        }
    }
}
