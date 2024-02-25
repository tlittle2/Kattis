import java.util.*;

public class Main {

    public static int findString(String ip, String delimiter){
        return (ip.length() - ip.replace(delimiter, "").length()) / delimiter.length();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();


        int smileCount = findString(ip, ":)");
        int frownCount = findString(ip, ":(");

        if(smileCount > 0 && frownCount == 0){
            System.out.println("alive");
        }else if(smileCount == 0 && frownCount > 0){
            System.out.println("undead");
        }else if(smileCount > 0 && frownCount > 0){
            System.out.println("double agent");
        }else{
            System.out.println("machine");
        }

        sc.close();
    }
}
