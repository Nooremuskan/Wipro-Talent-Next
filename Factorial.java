class Factorial {
    // Method to calculate factorial of a number
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        int number = 5 ; // Example number to calculate factorial
        long result = factorial(number); // Calculate factorial
        System.out.println("Factorial of " + number + " is: " + result); // Output the result
    }
}
