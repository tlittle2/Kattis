import java.util.Scanner;

public class Framvindustika {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String ip = sc.nextLine();

        Scanner ipScanner = new Scanner(ip);

        int percent = ipScanner.nextInt();
        int length = ipScanner.nextInt();

        //is over of concept
        // ex. what is 33% of 10 ->  x/33 = 10/100 = (33 * 10 / 100)
        int numberofPounds = (percent * length) / 100;

        //Start of output string
        System.out.print("[");

        //append #'s first
        for(int i = 0; i < numberofPounds; i++){
            System.out.print("#");
        }

        //for whatever spaces we have left to fill, at -'s
        for(int i = 0; i < length - numberofPounds; i++){
            System.out.print("-");
        }

        //Format the end of the loading bar (with string padding at the end to show final percentage)
        System.out.print("]" + " | " + String.format("%3s", percent) + "%");

    }
}
