package KhaiBaoClass;

import java.util.Scanner;

class PhanSo{
    private long a;
    private long b;

    public PhanSo(long a, long b){
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

public class J04003_PHAN_SO {

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
        PhanSo p = new PhanSo(a, b);
        long UCLN = gcd(a,b);
        long tu = p.getA() / UCLN;
        long mau = p.getB() / UCLN;
        System.out.println(tu + "/" + mau);
    }
}
