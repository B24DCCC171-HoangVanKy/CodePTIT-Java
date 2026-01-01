import java.util.Scanner;
import java.util.Stack;

public class J03027_RUT_GON_XAU_KY_TU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] string = sc.nextLine().split("");
        Stack<String> stack = new Stack<String>();
        for(String x : string){
            String current = x;
            if(stack.isEmpty()){
                stack.push(current);
            }
            else{
                if(stack.peek().equals(current)){
                    stack.pop();
                }else{
                    stack.push(current);
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Empty String");
        }else{
            for(String x : stack){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
