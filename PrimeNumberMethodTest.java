/*
 * Class: CMSC201 
 * Instructor: Kash
 * Description: (Give a brief description for each Program)
 * Due: 05/06/24
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: ____Trevor Holley______
*/


import org.junit.Test;

/**
 * This class contains JUnit test cases for the isPrime method in PrimeNumberMethod.java.
 */
public class PrimeNumberMethodTest {

    /**
     * Test case for the isPrime method with a prime number.
     */
    @Test
    public void testIsPrimeWithPrimeNumber() {
        assertTrue(PrimeNumberMethod.isPrime(5));
    }

    private void assertTrue(Object prime) {
	
		
	}

	/**
     * Test case for the isPrime method with a non-prime number.
     */
    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        assertFalse(PrimeNumberMethod.isPrime(4));
    }

    private void assertFalse(Object prime) {

		
	}

	/**
     * Test case for the isPrime method with 1.
     */
    @Test
    public void testIsPrimeWithOne() {
        assertFalse(PrimeNumberMethod.isPrime(1));
    }

    /**
     * Test case for the isPrime method with 0.
     */
    @Test
    public void testIsPrimeWithZero() {
        assertFalse(PrimeNumberMethod.isPrime(0));
    }

    /**
     * Test case for the isPrime method with a negative number.
     */
    @Test
    public void testIsPrimeWithNegativeNumber() {
        assertFalse(PrimeNumberMethod.isPrime(-5));
    }
}