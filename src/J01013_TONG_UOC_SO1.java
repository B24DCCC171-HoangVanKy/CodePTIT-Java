import java.util.Scanner;

public class J01013_TONG_UOC_SO1 {
    static final int MAX_VALUE = 2000001;
    static int [] minPrime = new int [MAX_VALUE];

    static void san(){
        for(int i = 2; i < MAX_VALUE; i++){
            minPrime[i] = i;
        }

        for(int i = 2; i*i < MAX_VALUE; i++ ){
            if(minPrime[i] == i){
                for(int j = i*i; j < MAX_VALUE; j+=i){
                    if(minPrime[j] == j){
                        minPrime[j] = i;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        san();
        int t  = scan.nextInt();
        long tong = 0;
        for(int i = 0; i < t; i++){
            int n = scan.nextInt();
            while(n > 1){
                tong += minPrime[n];
                n = n / minPrime[n];
            }
        }
        System.out.println(tong);
    }
}
