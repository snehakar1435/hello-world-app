public class HelloApp {
    public static void main(String[] args) {
        // Check if command-line argument is provided, else default to "World"
        String name = (args.length > 0) ? args[0] : "World";

        // Display personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}

