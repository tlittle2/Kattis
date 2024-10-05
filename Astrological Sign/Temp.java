import java.util.*;

public class Temp {
    public static void main(String[] args) {
      //Laman's Calendar for mapping out the zodiac signs (get the months, then have a day mapped a month
        HashMap<String, Map<Integer, List<String>>> calendar = new HashMap<>(Map.ofEntries(
                Map.entry("Mar", Map.of(21, List.of("Pisces", "Aries"))),
                Map.entry("Apr", Map.of(21, List.of("Aries", "Taurus"))),
                Map.entry("May", Map.of(21, List.of("Taurus", "Gemini"))),
                Map.entry("Jun", Map.of(22, List.of("Gemini", "Cancer"))),
                Map.entry("Jul", Map.of(23, List.of("Cancer", "Leo"))),
                Map.entry("Aug", Map.of(23, List.of("Leo", "Virgo"))),
                Map.entry("Sep", Map.of(22, List.of("Virgo", "Libra"))),
                Map.entry("Oct", Map.of(23, List.of("Libra", "Scorpio"))),
                Map.entry("Nov", Map.of(23, List.of("Scorpio", "Sagittarius"))),
                Map.entry("Dec", Map.of(22, List.of("Sagittarius", "Capricorn"))),
                Map.entry("Jan", Map.of(21, List.of("Capricorn", "Aquarius"))),
                Map.entry("Feb", Map.of(20, List.of("Aquarius", "Pisces")))
        ));

        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine().trim());
        for(int i = 0; i < cases; i++){
            String ip = sc.nextLine().trim();
            String[] parts = ip.split(" ");
            int ipDay = Integer.parseInt(parts[0]);
            String ipMonth = parts[1];
            for(Map.Entry<Integer, List<String>> entry:  calendar.get(ipMonth).entrySet()){
                if(ipDay < entry.getKey()){ //if the day value from standard input matches the day key for the month from the calendar, print the first value in the arrayList
                    System.out.println(entry.getValue().get(0));
                }else{ //else print the second one
                    System.out.println(entry.getValue().get(1));
                }
            }
        }
    }
}
