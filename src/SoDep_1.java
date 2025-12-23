

import java.util.Scanner;

public class SoDep_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            boolean check = true;
            String n = sc.nextLine();
            String[] arr = n.split("");
            if(n.contains("1") || n.contains("3") || n.contains("5")|| n.contains("7")|| n.contains("9")){
                System.out.println("NO");
                continue;
            }
            for(int j = 0; j < arr.length/2; j++){
                if(!(arr[j].equals(arr[arr.length-j-1]))){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
