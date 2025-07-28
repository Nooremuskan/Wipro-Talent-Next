//Write a fibonacci without recursive for first 5 numbers
public class FibonaWithoutRecursive {
    public static void main(String[] args) {
        int count = 100000; // Number of Fibonacci numbers to print
        int a = 0, b = 1; // Starting values of the Fibonacci sequence
        
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " "); // Print the current Fibonacci number
            int next = a + b; // Calculate the next number in the sequence
            a = b; // Update 'a' to the next number
            b = next; // Update 'b' to the next number
        }
        System.out.println(); // New line after printing the series
    }
}
