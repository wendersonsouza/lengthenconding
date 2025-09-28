package wenderson.ozorio.souza;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LengthEncoder {

    public static String encode(String text){
        StringBuilder stringBuilder = new StringBuilder();

        if(text instanceof String && text.length() > 0) {
            // split text to List
            List<String> list = Arrays.asList(text.split(""));

            // collect distinct entries from the List
            List<String> listDistinct = list.stream()
                    .distinct()
                    .collect(Collectors.toList());

            //load the distinct entries list to count the total of matching
            listDistinct.forEach(entry -> {
                stringBuilder.append(entry).append(totalMatching(entry, list));
            });
            System.out.println(text + " Total " + list.size());
            System.out.println(text + " Distinct " + listDistinct.size());
        }else{
            stringBuilder.append("Text is empty or null");
        }
        return stringBuilder.toString();
    }

    private static long totalMatching(String text, Collection<String> list){
        return list.stream().filter(entry -> text.equals(entry)).count();

    }
}
