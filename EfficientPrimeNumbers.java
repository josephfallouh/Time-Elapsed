// Joseph Fallouh - 1.4.0 A Observing Elapsed Time - CSC-280-350

public class EfficientPrimeNumbers {

    // replaces the main with a function and replaced n = 8000000 with a perameter
    public static void EfficientPrimeNumbers(int n) {

        // A list to hold prime numbers
        java.util.List<Integer> list
                = new java.util.ArrayList<>();

        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
        int squareRoot = 1; // Check whether number <= squareRoot

        // Repeatedly find prime numbers
        while (number <= n) {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            if (squareRoot * squareRoot < number) {
                squareRoot++;
            }

            // Test whether number is prime
            for (int k = 0; k < list.size()
                    && list.get(k) <= squareRoot; k++) {
                if (number % list.get(k) == 0) { // If true, not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }

            // Print the prime number and increase the count
            if (isPrime) {
                count++; // Increase the count
                list.add(number); // Add a new prime to the list
            }

            // Check whether the next number is prime
            number++;
        }

    }
    
}
