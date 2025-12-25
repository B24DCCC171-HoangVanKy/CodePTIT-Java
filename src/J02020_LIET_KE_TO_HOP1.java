import java.util.Scanner;

public class J02020_LIET_KE_TO_HOP1 {
    static int n;
    static int k;
    static int [] arr ;
    static int dem = 0;

    static void result(){
        dem++;
        for (int i = 1; i <= k; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void Try(int m){
        for (int i = arr[m - 1] + 1; i <= n - k + m ; i++){
            arr[m] = i;
            if (m == k){
                result();
            }else {
                Try(m+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[k + 1];
        arr[0] = 0;
        Try(1);
        System.out.printf("Tong cong co %d to hop",dem);
        sc.close();
    }
}
