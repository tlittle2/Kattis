import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class TrueRandom {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.print(n.charAt(new Random().nextInt(n.length())));
    }
}
