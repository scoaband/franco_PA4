public class Application {
    public static void main(String[] args) {
        DuplicateCounter duplicateCounter = new DuplicateCounter();

        try {
            duplicateCounter.count();
        } catch (Exception excpt) {
            // Prints the error message passed by throw statement
            System.out.println(excpt.getMessage());
            System.out.println("Cannot read file");
        }

        try {
            duplicateCounter.write();
        } catch (Exception excpt) {
            // Prints the error message passed by throw statement
            System.out.println(excpt.getMessage());
            System.out.println("Cannot read file");
        }
    }
}
