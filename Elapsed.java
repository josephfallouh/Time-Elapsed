// Joseph Fallouh - 1.4.0 A Observing Elapsed Time - CSC-280-350
import java.lang.reflect.Array;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class Elapsed {
    public static void main(String[] args) {
        // created an array for all the amount of numbers we want to test
        int[] numbers = {8000000, 10000000, 12000000, 14000000, 16000000, 18000000};

        // arrays to hold the elapsed time
        double[] primeTime = new double[6];
        double[] ePrimeTime = new double[6];

        // for loop to go through all the numbers in the array 'numbers'
        // within the for loop, stopwatch created, ran PrimeNumbers, and put the elapsed time in primeTime array
        for( int i = 0; i < numbers.length; i++) {
            Stopwatch timer = new Stopwatch();
            PrimeNumbers.PrimeNumbers(numbers[i]);
            primeTime[i] = timer.elapsedTime();
        }

        // for loop to go through all the numbers in the array 'numbers'
        // within the for loop, stopwatch created, ran EfficientPrimeNumbers, and put the elapsed time in ePrimeTime array
        for( int j = 0; j < numbers.length; j++) {
            Stopwatch timer = new Stopwatch();
            EfficientPrimeNumbers.EfficientPrimeNumbers(numbers[j]);
            ePrimeTime[j] = timer.elapsedTime();

        }

        // print results as a table using printf()
        StdOut.println();
        StdOut.printf("Amount of Num \t%s \t%s \t%s \t%s \t%s \t%s \n", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5]);
        StdOut.printf("Norm Prime Num \t%.3f \t\t%.3f \t\t%.3f \t\t%.3f \t\t%.3f \t\t%.3f \n", primeTime[0], primeTime[1], primeTime[2], primeTime[3], primeTime[4], primeTime[5]);
        StdOut.printf("Eff Prime Num \t%.3f \t\t%.3f \t\t%.3f \t\t%.3f \t\t%.3f \t\t%.3f \n", ePrimeTime[0], ePrimeTime[1], ePrimeTime[2], ePrimeTime[3], ePrimeTime[4], ePrimeTime[5]);
        StdOut.println();



    }
}