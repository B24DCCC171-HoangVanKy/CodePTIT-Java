

import java.util.Scanner;

public class SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i < n-1; i++){
            boolean ok = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j + 1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    ok = true;
                }
            }
            if(ok){
                System.out.print("Buoc " + (i+1) + ": ");
                for(int x : arr){
                    System.out.print(x + " ");
                }
                System.out.println();
            }else{
                break;
            }
        }

    }
}
