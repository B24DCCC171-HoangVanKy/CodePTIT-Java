package KhaiBaoClass;

import java.util.Scanner;

class SinhVien{
    private static final String maSv = "B20DCCN001";
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float diem;

    public SinhVien(){
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.diem = 0;
    }

    String getHoTen(){
        return hoTen;
    }

    void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }

    String getLop(){
        return lop;
    }

    void setLop(String lop){
        this.lop = lop;
    }

    String getNgaySinh(){
        String[] arr = ngaySinh.split("/");
        String res = "";
        String ngay = arr[0];
        String thang = arr[1];
        String nam = arr[2];
        if(ngay.length() < 2) ngay = "0" + ngay;
        if(thang.length() < 2) thang = "0" + thang;
        return ngay + "/"  + thang + "/" + nam;
    }

    void setNgaySinh(String ngaySinh){
        this.ngaySinh = ngaySinh;
    }
    String getMaSv(){
        return maSv;
    }

    float getDiem(){
        return diem;
    }

    void setDiem(float diem){
        this.diem = diem;
    }
}
public class J04006_KHAI_BAO_LOP_SINH_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();

        String hoTen = sc.nextLine();
        String lop = sc.nextLine();
        String ngaySinh = sc.nextLine();
        float diem = sc.nextFloat();

        sv.setHoTen(hoTen);
        sv.setLop(lop);
        sv.setNgaySinh(ngaySinh);
        sv.setDiem(diem);
        System.out.printf("%s %s %s %s %.2f",sv.getMaSv(), sv.getHoTen(), sv.getLop(),sv.getNgaySinh(),sv.getDiem());
    }
}
