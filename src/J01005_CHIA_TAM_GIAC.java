import java.util.Scanner;

public class J01005_CHIA_TAM_GIAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            double n = sc.nextInt();
            double h =  sc.nextInt();

            for(int i = 1 ; i < n; i++){
                double h_i = Math.sqrt(i/n)*h;
                System.out.printf("%.6f ",h_i);
            }
            System.out.println();
        }
    }
}
