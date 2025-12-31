import java.util.Scanner;

public class J02022_SO_XA_CACH {
    static int n;
    static int[] a;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        for( int i = 0; i < t; i++){
            n  = sc.nextInt();
            a = new int[n + 1];
            used = new boolean[n + 1];
            Try(1);
        }
    }

    static void result(){
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            sb.append(a[i]);
        }
        System.out.println(sb.toString());
    }

    static void Try(int m){
        for(int i = 1; i <= n; i++){
            if(!used[i]){
                if(m > 1 && Math.abs(i - a[m-1]) == 1){
                    continue;
                }
                a[m] = i;
                used[i] = true;

                if(m == n){
                    result();
                }else{
                    Try(m+1);
                }
                used[i] = false;
            }
        }
    }
}
