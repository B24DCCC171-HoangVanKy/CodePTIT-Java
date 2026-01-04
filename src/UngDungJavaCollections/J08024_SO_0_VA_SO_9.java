package UngDungJavaCollections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024_SO_0_VA_SO_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Queue<Long> queue = new LinkedList<>();
            queue.offer(9L);
            int n = sc.nextInt();
            while(!queue.isEmpty()){
                Long value = queue.poll();
                if(value % n == 0 ){
                    System.out.println(value);
                    break;
                }else{
                    queue.offer(value*10 +0L);
                    queue.offer(value*10 + 9L);
                }
            }
        }
    }

}
