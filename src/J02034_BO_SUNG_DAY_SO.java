import java.util.Scanner;
public class J02034_BO_SUNG_DAY_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean [] existed = new boolean[201];
        int maxValue = 0;
        boolean excellent = true;
        for (int i = 0; i < t; i++){
            int n =  sc.nextInt();
            existed[n] = true;
            if(n > maxValue){
                maxValue = n;
            }
        }

        for(int i = 1; i <= maxValue; i++){
            if(!existed[i]){
                System.out.println(i);
                excellent = false;
            }
        }
        if(excellent){
            System.out.println("Excellent!");
        }

    }
}
