import java.io.IOException;
import java.util.Scanner;

public class Sith {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String user = sc.nextLine();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = sc.nextInt();

        if(a-b== answer && Math.abs(b-a) == answer){
            System.out.print("VEIT EKKI");
        }else if(b - a == answer){
            System.out.print("SITH");
        }else if(a - b == answer){
            System.out.print("JEDI");
        }

    }
}
