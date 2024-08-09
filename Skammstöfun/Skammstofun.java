import java.io.IOException;
import java.util.*;

public class Skammstofun {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        sc.nextInt();
        sc.nextLine();
        String words = sc.nextLine();

        for(String i: words.split(" ")){
            if(Character.isUpperCase(i.charAt(0))){
                System.out.print(i.charAt(0));
            }
        }
    }
}
