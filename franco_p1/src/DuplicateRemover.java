import java.io.*;
import java.util.HashSet;
import java.util.Scanner;


public class DuplicateRemover<nextWord> {
private  HashSet<String> uniqueWords = new HashSet<>();

    public void remove() throws IOException {


        File file = new File("problem1.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String word  = input.next();
            uniqueWords.add(word);
        }

        input.close();

    }

    public void write()throws IOException {
        File file = new File("unique_words.txt");

        // creates the file
        file.createNewFile();

        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);

        // Writes the content to the file
        writer.write(String.valueOf(uniqueWords));
        writer.flush();
        writer.close();

    }

}
