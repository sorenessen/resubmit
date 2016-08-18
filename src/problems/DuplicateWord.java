package problems;

/**
 * Created by mrahman on 4/9/16.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class DuplicateWord {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        String text = "Times were tough, Times were crazy, Time and time again the turtles were crazy lazy";

        List<String> list = Arrays.asList(text.split(" "));

        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
    }
}

