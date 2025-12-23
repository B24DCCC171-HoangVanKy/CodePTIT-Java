

import java.util.Scanner;

public class ChuanHoaHoTen_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            StringBuilder sb = new StringBuilder();
            String s = sc.nextLine().trim();
            String[] arr = s.split(" ");
            for (int j = 0; j < arr.length; j++) {
                if(!(arr[j].equals(""))){
                    String kq = String.valueOf(arr[j].charAt(0));
                    sb.append(kq.toUpperCase() + arr[j].substring(1).toLowerCase() + " ");
                }
            }
            String fullName = sb.toString().trim();
            int firstSpace = fullName.indexOf(" ");
            String ho =", " + fullName.substring(0, firstSpace).toUpperCase();
            String ten = fullName.substring(firstSpace + 1);

            String nameEnglish = ten + ho;
            System.out.println(nameEnglish);

        }
    }
}
