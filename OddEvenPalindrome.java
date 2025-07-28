// OddEvenPalindrome.java
// This class is currently empty and serves as a placeholder for future implementation. 
// You can add methods to handle odd and even palindromes or any other functionality as needed.
// The following code snippet demonstrates how to print odd and even digits separately. 
public class OddEvenPalindrome {
    static void printOddAndEvenDigits(int n) {
        StringBuilder oddDigits = new StringBuilder();
        StringBuilder evenDigits = new StringBuilder();
        
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            if (digit % 2 == 0) {
                evenDigits.append(digit).append(" "); // Append to even digits
            } else {
                oddDigits.append(digit).append(" "); // Append to odd digits
            }
            n /= 10; // Remove the last digit
        }
        
        System.out.println("Odd Digits: " + oddDigits.toString().trim());
        System.out.println("Even Digits: " + evenDigits.toString().trim());
    }
    
}
