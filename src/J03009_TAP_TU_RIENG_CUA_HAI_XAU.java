
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class J03009_TAP_TU_RIENG_CUA_HAI_XAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            String[] arr1 = s1.split("\\s+");
            String[] arr2 = s2.split("\\s+");
            TreeSet<String> ts1 = new TreeSet<>(Arrays.asList(arr1));
            HashSet<String> ts2 = new HashSet<>(Arrays.asList(arr2));
            for(String x : ts1){
                if(!ts2.contains(x)){
                    System.out.print(x + ' ');
                }
            }
            System.out.println();
        }
    }
}
