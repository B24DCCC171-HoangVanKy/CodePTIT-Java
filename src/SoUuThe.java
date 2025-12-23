

import java.util.Scanner;

public class SoUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if((s.charAt(0) == '0') || !isDigit(s) ){
                System.out.println("INVALID");
            }else if(isUuThe(s)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }

    static boolean isDigit(String s){

        for(char c : s.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    static boolean isUuThe(String s){
        int le = 0;
        int chan = 0;
        for(char c : s.toCharArray()){
            int d = c - '0';
            if(d % 2 == 0) {
                chan++;
            }else{
                le++;
            }
        }
        if(le > chan && s.length() % 2 == 1){
            return true;
        }
        if(le < chan && s.length() % 2 == 0){
            return true;
        }
        return false;
    }

}
