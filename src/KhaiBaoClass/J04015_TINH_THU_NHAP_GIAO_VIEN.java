package KhaiBaoClass;

import java.util.Scanner;

class GiaoVien{
    private String id, name;
    private int salary;
    public GiaoVien(){
    }

    int getPhuCap(){
        String phuCap = id.substring(0,2);
        if(phuCap.equals("HT")) return 2000000;
        if(phuCap.equals("HP")) return 900000;
        if(phuCap.equals("GV")) return 500000;
        return 0;
    }

    int getHeSo(){
        return Integer.parseInt(id.substring(2));
    }

    int getSalary(){

        return salary*getHeSo() + getPhuCap();
    }

    void nhapDuLieu(Scanner sc){
        id = sc.nextLine();
        name = sc.nextLine();
        salary = sc.nextInt();
    }

    void hienThi(){
        System.out.printf("%s %s %d %d %d",id, name, getHeSo(), getPhuCap(), getSalary());
    }
}

public class J04015_TINH_THU_NHAP_GIAO_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien gv = new GiaoVien();
        gv.nhapDuLieu(sc);
        gv.hienThi();
    }
}
