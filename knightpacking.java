import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextInt() % 2 == 1){
            System.out.println("first");
        }else{
            System.out.println("second");
        }
    }
}
