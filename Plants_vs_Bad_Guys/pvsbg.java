import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        String line = scanner.nextLine();
        Scanner lineScanner = new Scanner(line);

        // Process the integers
        for (int i = 0; i < n; i++) {
            arr.add(lineScanner.nextInt());
        }
        System.out.println(Collections.min(arr)+1);
    }
}
