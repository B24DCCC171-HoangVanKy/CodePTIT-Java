package KhaiBaoClass;

import java.util.Scanner;

class Rectange{
    private double x;
    private double y;
    private String color;

    Rectange(){
        this.x = 1;
        this.y = 1;
    }

    Rectange(double x, double y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    String getColor(){
        return color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
    }

    void setX(double x){
        this.x = x;
    }
    void setY(double y){
        this.y = y;
    }

    void setColor(String color){
        this.color = color;
    }

    double getArea(){
        return x * y;
    }

    double getPerimeter(){
        return (x+y)*2;
    }

}
public class J04002_KHAI_BAO_LOP_HINH_CHU_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange r = new Rectange(sc.nextDouble(),sc.nextDouble(),sc.next());
        if(r.getX() <= 0 || r.getY() <= 0) System.out.println("INVALID");
        else System.out.printf("%.0f %.0f %s\n",r.getPerimeter(),r.getArea(),r.getColor());
    }
}
