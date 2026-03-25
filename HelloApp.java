public class HelloApp {
    public static void main(String[] args) {
        // Check if no arguments are provided
        if (args.length == 0) {
            // Default greeting when no arguments given
            System.out.println("Hello, World!");
        } else {
            // Use StringBuilder to build names with delimiter after each name
            StringBuilder nameBuilder = new StringBuilder();
            // Enhanced for loop to iterate through all arguments
            for (String name : args) {
                // Append each name followed by comma and space
                nameBuilder.append(name).append(", ");
            }
            // Use substring to remove the trailing ", " (last 2 characters)
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);
            // Display greeting with all names
            System.out.println("Hello, " + names + "!");
        }
    }
}