import java.io.IOException;
import java.util.*;

public class Temp {

    public static void main(String[] args) throws IOException {
        HashMap<String, List<Integer>> table = new HashMap<>( Map.ofEntries(
                Map.entry("Reykjavik", List.of(0,388)),
                Map.entry("Kopavogur", List.of(6,387)),
                Map.entry("Hafnarfjordur", List.of(12,391)),
                Map.entry("Reykjanesbaer", List.of(48,427)),
                Map.entry("Akureyri", List.of(388,0)),
                Map.entry("Gardabaer", List.of(9,389)),
                Map.entry("Mosfellsbaer", List.of(16,371)),
                Map.entry("Arborg", List.of(64,428)),
                Map.entry("Akranes", List.of(49,350)),
                Map.entry("Fjardabyggd", List.of(659,290)),
                Map.entry("Mulathing", List.of(603,216)),
                Map.entry("Seltjarnarnes", List.of(4,390))
                ));


        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();

        List<Integer> values = table.get(city);

        System.out.print((values.get(0) > values.get(1))? "Akureyri" : "Reykjavik");

    }
}
