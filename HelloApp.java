public class HelloApp {
    public static void main(String[] args) {
        // Check if any command-line arguments are provided
        if (args.length == 0) {
            // No arguments provided, use default "World"
            System.out.println("Hello, World!");
        } else {
            // Loop through all arguments and print greeting for each name
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello, " + args[i] + "!");
            }
        }
    }
}
