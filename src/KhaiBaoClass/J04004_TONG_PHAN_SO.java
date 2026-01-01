package KhaiBaoClass;

import java.util.Scanner;

class PhanSo2{
    private long a;
    private long b;

    public PhanSo2(long a, long b){
        this.a = a;
        this.b = b;
    }

    public long getA(){
        return a;
    }

    public long getB(){
        return b;
    }
}

public class J04004_TONG_PHAN_SO {

    static long gcd(long a,long b){
        while( b!= 0){
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long tu = a*d +  b*c;
        long mau = b*d;

        long UCLN = gcd(tu,mau);
        System.out.printf("%d/%d",tu/UCLN,mau/UCLN);

    }
}
