

import java.util.Scanner;

public class MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++){
            int n = sc.nextInt();
            int[] numbers = new int[n];
            for(int k = 0; k < n; k++){
                numbers[k] = sc.nextInt();
            }
            boolean doiXung = true;

            for(int i = 0; i < n/2; i++){
                if(numbers[i] != numbers[n-i-1]){
                    doiXung = false;
                    break;
                }
            }
            String res = doiXung ? "YES" : "NO";
            System.out.println(res);

        }
    }
}
