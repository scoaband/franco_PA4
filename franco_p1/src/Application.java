import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        DuplicateRemover duplicateRemover = new DuplicateRemover();

        try {
            duplicateRemover.remove();
        } catch (Exception excpt) {
            // Prints the error message passed by throw statement
            System.out.println(excpt.getMessage());
            System.out.println("Cannot read file");
        }
        try {
            duplicateRemover.write();
        } catch (Exception excpt) {
            // Prints the error message passed by throw statement
            System.out.println(excpt.getMessage());
            System.out.println("Cannot read file");
        }

    }
}