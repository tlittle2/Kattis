import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//Current Solution gives run-time error on the test cases despite the solution appearing to be correct
public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String, ArrayList<String>> m = new HashMap<String, ArrayList<String>>();

        m.put("@", new ArrayList<String>(Arrays.asList("at")));
        m.put("&", new ArrayList<String>(Arrays.asList("and")));
        m.put("1", new ArrayList<String>(Arrays.asList("one", "won")));
        m.put("2", new ArrayList<String>(Arrays.asList("two", "too","to")));
        m.put("4", new ArrayList<String>(Arrays.asList("four", "for")));
        m.put("b", new ArrayList<String>(Arrays.asList("bee", "bea","be")));
        m.put("c", new ArrayList<String>(Arrays.asList("sea", "see")));
        m.put("i", new ArrayList<String>(Arrays.asList("eye")));
        m.put("o", new ArrayList<String>(Arrays.asList("owe","oh")));
        m.put("r", new ArrayList<String>(Arrays.asList("are")));
        m.put("u", new ArrayList<String>(Arrays.asList("you")));
        m.put("y", new ArrayList<String>(Arrays.asList("why")));


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for(int i = 0; i < cases; i++){
            StringBuilder sb = new StringBuilder();
            String sentence = bufferedReader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(sentence);
            while(tokenizer.hasMoreTokens()){
                String word = tokenizer.nextToken();
                //System.out.println(word);
                for(Map.Entry<String, ArrayList<String>> entry: m.entrySet()){
                    String transformedWord;
                    for(String conversion: entry.getValue()){

                        //Save off lower case word in variable normalize the check
                        String lower = word.toLowerCase();
                        if (lower.contains(conversion)) {
                            //System.out.printf("Found -> %s %s %s\n", word, conversion, entry.getKey());
                            transformedWord = lower.replace(conversion, entry.getKey());
                            //System.out.println(transformedWord);

                            //if the first character of the original word is upper case, change the transformed word to the same case
                            if (Character.isUpperCase((word.charAt(0)))){
                                transformedWord = transformedWord.substring(0, 1).toUpperCase() + transformedWord.substring(1);
                            }
                            word = transformedWord;
                        }
                    }
                }
                if(i == cases){
                    sb.append(word);
                }else{
                    sb.append(word + " ");
                }
            }
            System.out.println(sb.toString().replaceAll("\\r\\n", ""));
        }
    }
}
