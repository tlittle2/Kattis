import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Temp {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> charSet = new HashSet<>();

        //Create set of all lower case characters
        for (char ch = 'a'; ch <= 'z'; ch++) {
            charSet.add(ch);
        }

        int cases = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < cases; i++){
            HashSet<Character> wordSet = new HashSet<>();
            String line = sc.nextLine().toLowerCase();

            //for all lower case characters in the line input, add it to the wordset
            for(char c: line.toCharArray()){
                if(Character.isLowerCase(c)){
                    wordSet.add(c);
                }
            }

            //find all characters from charSet that are not in the wordSet, and create a list out of them
            List<Character> missing = charSet.stream()
                    .filter(c -> !wordSet.contains(c))
                    .sorted()
                    .toList();

            //if the resulting list is empty, the word is a panagram
            if (missing.size() == 0){
                System.out.println("pangram");
            }else{
                StringBuilder dummyString = new StringBuilder();
                for(char c: missing){
                    dummyString.append(c);
                }
                System.out.println("missing " + dummyString);
            }
        }
        sc.close();
    }
}
