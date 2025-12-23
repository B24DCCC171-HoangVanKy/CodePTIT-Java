

import java.util.Scanner;

public class SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int buoc = 1;
        for(int i = 0; i < n - 1; i++){
            boolean ok = false;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    ok = true;
                }
            }
           if(ok) {
               System.out.print("Buoc " + buoc + ": ");
               for(int x : arr){
                   System.out.print(x + " ");
               }
               System.out.println();
               buoc++;
           }
           else{
               break;
           }
        }

    }
}
