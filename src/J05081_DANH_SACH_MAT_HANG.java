import java.util.Scanner;

class Item{
    static private int count = 0;

    private String id, name, donVi;
    private int  buy, sell, loiNhuan;

    Item(){
        count++;
        this.id = "MH" + String.format("%03d", count) ;
    }

    void nhapDuLieu(Scanner sc){
        sc.nextLine();
        name = sc.nextLine();
        donVi = sc.nextLine();
        buy = sc.nextInt();
        sell = sc.nextInt();
        loiNhuan = sell - buy;
    }

    int getLoiNhuan(){
        return loiNhuan;
    }

    void hienThi(){
        System.out.printf("%s %s %s %d %d %d\n", id, name, donVi, buy, sell, loiNhuan);
    }
}

public class J05081_DANH_SACH_MAT_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Item[] items = new Item[t];
        for(int i = 0; i < t; i++){
            items[i] = new Item();
            items[i].nhapDuLieu(sc);
        }

        int len = items.length;
        for(int i = 1; i < len; i++){
            Item key = items[i];
            int pos = i -1;
            while(pos >= 0 && items[pos].getLoiNhuan() < key.getLoiNhuan()){
                items[pos+1] =  items[pos];
                pos = pos-1;
            }
            items[pos+1] =  key;
        }

        for(Item item : items){
            item.hienThi();
        }
    }
}
