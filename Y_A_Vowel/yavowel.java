import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i', 'o', 'u'));

        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();

        int vCount = 0;
        int yCount = 0;

        for(char c: ip.toCharArray()){
            if(vowels.contains(c)){
                vCount +=1;
                yCount +=1;
            }
            else if (!vowels.contains(c) && c == 'y'){
                yCount +=1;
            }
        }
        System.out.println(vCount + " " + yCount);
        sc.close();
    }
}
