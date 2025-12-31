import java.util.Scanner;


public class J02101_IN_MA_TRAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int [][] matrix = new int[n+1][n+1];
            for(int j = 1; j <=n; j++){
                for(int k = 1; k <=n; k++){
                    matrix[j][k] = sc.nextInt();
                }
            }

            for (int j = 1; j <=n; j++){
                if(j % 2 == 1){
                    for(int k = 1; k <=n; k++){
                        System.out.print(matrix[j][k] + " ");
                    }
                }else{
                    for(int k = n; k >= 1; k--){
                        System.out.print(matrix[j][k] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

}
