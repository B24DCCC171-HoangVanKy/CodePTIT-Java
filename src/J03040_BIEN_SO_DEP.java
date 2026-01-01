import java.util.Scanner;

public class J03040_BIEN_SO_DEP {
    static boolean checkTangDan(String s){
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) >= s.charAt(i+1)) return false;
        }
        return true;
    }

    static boolean checkEquals(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(0) != s.charAt(i)) return false;
        }
        return true;
    }

    static boolean checkSoPhatLoc(String s){
        for(int i = 0; i < s.length(); i++){
            if("68".indexOf(s.charAt(i)) == -1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String input = s.substring(s.indexOf("-")+1);
            String head =  input.substring(0, input.indexOf("."));
            String end =  input.substring(input.indexOf(".")+1);
            String res = head + end;

            if(checkTangDan(res) || checkEquals(res) || checkSoPhatLoc(res) || (checkEquals(head) && checkEquals(end))){
                System.out.println("YES");

            }else{
                System.out.println("NO");
            }
        }

    }

}
