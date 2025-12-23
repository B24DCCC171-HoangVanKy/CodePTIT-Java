

import java.util.Scanner;

public class HinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int maxX = findMax(x1, x2, x3 ,x4);
        int maxY = findMax(y1, y2, y3 ,y4);
        int minX = Math.min(Math.min(x1,x2),Math.min(x3,x4));
        int minY = Math.min(Math.min(y1,y2),Math.min(y3,y4));

        int chieuRong = maxX - minX;
        int chieuDai = maxY - minY;

        if( chieuDai > chieuRong){
            System.out.println(chieuDai*chieuDai);
        }else{
            System.out.println(chieuRong*chieuRong);
        }

    }
    static int findMax(int... number){
        int max = number[0];
        for(int i=1;i<number.length;i++){
            if(number[i]>max){
                max = number[i];
            }
        }
        return max;
    }
}
