public class HelloApp {
    public static void main(String[] args) {
        // Check if no arguments are provided
        if (args.length == 0) {
            // Default greeting when no arguments given
            System.out.println("Hello, World!");
        } else {
            // Use StringBuilder to build comma-separated names
            StringBuilder names = new StringBuilder();
            // Enhanced for loop to iterate through all arguments
            for (String name : args) {
                // Add comma only if names already has content
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }
            // Display greeting with all names
            System.out.println("Hello, " + names + "!");
        }
    }
}