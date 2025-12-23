

import java.util.Scanner;

public class MangDoiXung_DeQuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for ( int i =0; i < t; i++) {
            int n = sc.nextInt();
            int[] numbers = new int[n];
            for (int j = 0; j < n; j++) {
                numbers[j] = sc.nextInt();
            }
            int l = 0;
            int r = n - 1;
            if(checkDoiXung(numbers,l,r)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    static boolean checkDoiXung(int[] arr, int l, int r) {
        if ( l >= r) return true;
        if ( arr[l] != arr[r]) return false;
        return checkDoiXung(arr, l+1, r-1);

    }
}
