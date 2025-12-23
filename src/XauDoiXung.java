

import java.util.Scanner;

public class XauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            int len = s.length();
            int dem = isDoiXung(s);
            if(dem == 1 || ( dem == 0 && len % 2 ==0)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static int isDoiXung(String s){
        int dem = 0;
        int n = s.length();
        char[] charArray = s.toCharArray();
        for(int i = 0; i < s.length()/2; i++){
            if(charArray[i] != charArray[n - i - 1]){
                dem++;
            }
        }
        return dem ;
    }
}
