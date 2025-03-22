// This is a simple Java program

public class Myproject {
    public static void main(String[] args) {
        // Print Hello World to the console
        System.out.println("Hello, World!");
        
        // Example of using variables
        int a = 5;
        int b = 10;
        int sum = a + b;

        // Print the sum
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        // Using a loop to print numbers 1 to 5
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Calling a method to display a greeting message
        greetUser("Ashwin");
    }

    // A simple method to print a greeting message
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
    }
}
