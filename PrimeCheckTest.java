// Michelle Wenig, Dani Barnaoui

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    assertEquals("Test 3", true, PrimeCheck.isPrime(3));
    assertEquals("Test 5", true, PrimeCheck.isPrime(5));
    assertEquals("Test 7", true, PrimeCheck.isPrime(7));
    assertEquals("Test 127", true, PrimeCheck.isPrime(127));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
    assertEquals("Test 4", false, PrimeCheck.isPrime(4));
    assertEquals("Test 6", false, PrimeCheck.isPrime(6));
    assertEquals("Test 8", false, PrimeCheck.isPrime(8));
    assertEquals("Test 128", false, PrimeCheck.isPrime(128));
  }
}
