

import java.util.Scanner;

public class XauNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        for (int i = 0; i < t; i++) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            System.out.println(timKyTu(N, K));
        }
    }
    static String timKyTu(int N, long K){
        long[] len = new long[93];
        len[1] = 1;
        len[2] = 1;
        for(int i = 3; i < 93; i++){
            len[i] = len[i-2] + len[i-1];
        }
        while(N > 2){
            long doDai = len[N-2];
            if(K > doDai) {
                K-=doDai;
                N-=1;
            }else {
                N-=2;
            }
        }
        if( N == 1 ) return "0";
        return "1";
    }

}
