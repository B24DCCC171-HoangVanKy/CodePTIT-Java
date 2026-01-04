package KhaiBaoClass;

import java.util.Scanner;

class Point2{
    private double x,y;

    Point2(){}

    Point2(double x,double y){
        this.x=x;
        this.y = y;
    }

    Point2(Point2 p){
        this.x = p.x;
        this.y = p.y;
    }

    double getX(){
        return x;
    }

    double getY(){
        return y;
    }

    double distance(Point2 p){
        return Math.sqrt(Math.pow(x-p.x,2) + Math.pow(y - p.y,2));
    }

}

public class J04008_CHU_VI_TAM_GIAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point2 p1 = new Point2(sc.nextDouble(),sc.nextDouble());
            Point2 p2 = new Point2(sc.nextDouble(),sc.nextDouble());
            Point2 p3 = new Point2(sc.nextDouble(),sc.nextDouble());

            double a =  p1.distance(p2);
            double b =  p2.distance(p3);
            double c =  p3.distance(p1);

            if(a+b <= c || a+c <= b || b+c <= a){
                System.out.println("INVALID");
            }else{
                System.out.printf("%.3f\n",a+b+c);
            }
        }
    }
}
