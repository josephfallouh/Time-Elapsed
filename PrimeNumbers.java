// Joseph Fallouh - 1.4.0 A Observing Elapsed Time - CSC-280-350

public class PrimeNumbers {

    // replaces the main with a function and replaced n = 8000000 with a perameter
    public static void PrimeNumbers(int n) {

        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        // Repeatedly find prime numbers
        while (number <= n) {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            // Test if number is prime
            for (int divisor = 2; divisor <= (int) (Math.sqrt(number));
                    divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }

            // Print the prime number and increase the count
            if (isPrime) {
                count++; // Increase the count
            }

            // Check if the next number is prime
            number++;
        }

    }
    
}
