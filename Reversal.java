import java.io.*;
import java.util.*;

public class Reversal {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n ; i++){
            s.push(sc.nextInt());
        }
        for(int i = 0; i < n ; i++){
            System.out.println(s.pop());
        }
        sc.close();
    }
}
