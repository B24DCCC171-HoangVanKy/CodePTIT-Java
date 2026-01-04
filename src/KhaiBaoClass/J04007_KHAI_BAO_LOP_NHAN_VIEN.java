package KhaiBaoClass;

import java.util.Scanner;

class NhanVien{
    private String id;
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String idTax;
    private String signedDate;

    NhanVien(){
        this.id = "00001";
        this.name = "";
        this.gender = "";
        this.dateOfBirth = "";
        this.address = "";
        this.idTax = "";
        this.signedDate = "";
    }

    String chuanHoaDate(String s){
        String[] arr = s.split("/");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() < 2) arr[i] = "0" + arr[i];
        }
        return arr[0] + "/" + arr[1] + "/" + arr[2] ;
    }

    void NhapDuLieu(Scanner sc){
        this.name = sc.nextLine();
        this.gender = sc.nextLine();
        this.dateOfBirth = chuanHoaDate(sc.nextLine());
        this.address = sc.nextLine();
        this.idTax = sc.nextLine();
        this.signedDate = chuanHoaDate(sc.nextLine());
    }

    void hienThi(){
        System.out.printf("%s %s %s %s %s %s %s",id,name,gender,dateOfBirth,address,idTax,signedDate);
    }
}

public class J04007_KHAI_BAO_LOP_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nhanVien = new NhanVien();
        nhanVien.NhapDuLieu(sc);
        nhanVien.hienThi();
    }
}
