
public class HelloApp {
    public static void main(String[] args) {
        // Check if no arguments are provided
        if (args.length == 0) {
            // Default greeting when no arguments given
            System.out.println("Hello, World!");
        } else {
            // Use String.join() to concatenate all names with ", " delimiter
            String names = String.join(", ", args);
            // Display greeting with all names
            System.out.println("Hello, " + names + "!");
        }
    }
}