//Write a java program to print 5 Fibonacci numbers
// Fibonacci.java
// This class is currently empty and serves as a placeholder for future implementation.
// You can add methods to handle Fibonacci sequence generation or any other functionality as needed.
// The following code snippet demonstrates how to print the first 5 Fibonacci numbers.
public class Fibonacci {
    static void printFibonacci(int count) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printFibonacci(5); // Output: 0 1 1 2 3
    }
}

// The code above correctly generates and prints the first 5 Fibonacci numbers: 0, 1, 1, 2, and 3.
// You can further enhance this class by adding methods to generate Fibonacci numbers up to a certain limit     
// or to check if a number is part of the Fibonacci sequence.
// If you want to keep the original Fibonacci logic, you can combine both functionalities as follows.
//recursive Fibonacci implementation
