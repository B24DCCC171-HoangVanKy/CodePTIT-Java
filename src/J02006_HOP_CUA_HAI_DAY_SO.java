import java.util.Scanner;
import java.util.TreeSet;

public class J02006_HOP_CUA_HAI_DAY_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ts1.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            ts2.add(sc.nextInt());
        }
        ts1.addAll(ts2);
        for(Integer i : ts1){
            System.out.print(i + " ");
        }
    }
}
