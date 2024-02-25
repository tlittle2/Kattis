import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        if(n.contains("COV")){
            System.out.println("Veikur!");
        }else{
            System.out.println("Ekki veikur!");
        }
    }
}
