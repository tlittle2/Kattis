import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mod = n % 4;
        double ans = (n/4) + (mod * 0.25);
        System.out.println(ans);
    }
}
