import java.util.Scanner;
import java.util.TreeSet;

public class J02005_GIAO_CUA_HAI_DAY_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();

        for(int i=0;i<m;i++){
            ts1.add(sc.nextInt());
        }

        for(int i=0;i<n;i++){
            ts2.add(sc.nextInt());
        }
        // Phương thức retainALl của interface Set giúp lọc phần giao của 2 tập hợp và trả về phần giao đó( tăng dần tuwj sắp xếp) vào đối tượng dùng.
        ts1.retainAll(ts2);

        for(Integer x : ts1){
            System.out.print(x + " ");
        }
    }
}
