import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J03020_TIM_TU_THUAN_NGHICH_DAI_NHAT {
    static boolean isThuanNgich(String s){
        StringBuilder sb = new StringBuilder(s);
        String ori = sb.toString();
        return ori.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.trim().split("\\s+");
        List<String> list = new ArrayList<String>();
        for(String x : arr){
            if(isThuanNgich(x)){
                list.add(x);
            }
        }

        int[] dems = new int[list.size()];
        for(int i = 0; i < dems.length; i++){}
    }
}
