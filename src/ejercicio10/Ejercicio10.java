/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author Prueba
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
   
       public static void main(String[] args) {
		int numberOfPrimes = 0;	// Counts the number of prime numbers

		// Find the number of prime numbers less than 10000
		for (int i = 1; i < 1000; i++) {
			if (PrimeNumberMethod.isPrime(i))
				numberOfPrimes++; // Increament 
		}

		// Display result
		System.out.println(
			"The number of prime numbers less than 10000: " + numberOfPrimes);
    }
    
}
