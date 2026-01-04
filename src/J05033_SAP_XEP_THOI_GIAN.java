import java.util.Scanner;

class Time {
    int h, m, s, totalS;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
        this.totalS = h * 3600 + m * 60 + s;
    }

    // In theo định dạng đề bài yêu cầu
    public void hienThi() {
        System.out.println(h + " " + m + " " + s);
    }
}

public class J05033_SAP_XEP_THOI_GIAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int t = sc.nextInt();
        Time[] arr = new Time[t];

        for (int i = 0; i < t; i++) {
            arr[i] = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        // Sắp xếp mảng đối tượng (Insertion Sort)
        for (int j = 1; j < t; j++) {
            Time key = arr[j];
            int pos = j - 1;
            while (pos >= 0 && arr[pos].totalS > key.totalS) {
                arr[pos + 1] = arr[pos];
                pos = pos - 1;
            }
            arr[pos + 1] = key;
        }

        for (Time time : arr) {
            time.hienThi();
        }
    }
}