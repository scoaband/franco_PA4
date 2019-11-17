import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class DuplicateCounter {

   private HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();

    public void count() throws IOException {
        File file = new File("problem2.txt");
        ArrayList<String> result = new ArrayList<>();

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String word  = input.next();
            result.add(word);
        }

        input.close();

        Set<String> unique = new HashSet<String>(result);
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(result, key));
            wordCounter.put(key, Collections.frequency(result, key));
        }
        System.out.println(wordCounter);
    }
    public void write()throws IOException {
        File file = new File("unique_word_counts.txt");

        // creates the file
        file.createNewFile();

        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);

        // Writes the content to the file
        writer.write(String.valueOf(wordCounter));
        writer.flush();
        writer.close();

    }

}
