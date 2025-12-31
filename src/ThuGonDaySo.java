import java.util.Stack;
import java.util.Scanner;
public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int current = sc.nextInt();

            if(!stack.isEmpty()){
                int top = stack.peek();

                if( (top + current) % 2 == 0 ){
                    stack.pop();
                }else{
                    stack.push(current);
                }
            }else{
                stack.push(current);
            }
        }
        System.out.println(stack.size());
        sc.close();
    }
}