

import java.util.ArrayList;
import java.util.Scanner;

public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        sc.nextLine();
        ArrayList<String> emails = new ArrayList<>();
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            String emailDaTao = taoEmail(s);

            int count = 0;
            for(String e : emails){
                if(e.equals(emailDaTao)) count++;
            }
            if (count==0){
                System.out.println(emailDaTao + "@ptit.edu.vn");
            }
            else {
                System.out.println(emailDaTao + (count+1) + "@ptit.edu.vn");
            }
            emails.add(emailDaTao);
        }

    }
    public static String taoEmail(String s){
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        int len = arr.length;
        for(int i = 0; i < len - 1; i++){
            sb.append(String.valueOf(arr[i].charAt(0)).toLowerCase());
        }
        String ten = arr[len-1].toLowerCase();
        String res = ten + sb.toString();
        return res;
    }
}
