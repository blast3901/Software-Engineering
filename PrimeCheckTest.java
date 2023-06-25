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
    assertTrue("Test 3", PrimeCheck.isPrime(3));
    assertTrue("Test 5", PrimeCheck.isPrime(5));
    assertTrue("Test 7", PrimeCheck.isPrime(7));
    assertTrue("Test 127", PrimeCheck.isPrime(127));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
    assertFalse("Test 4", PrimeCheck.isPrime(4));
    assertFalse("Test 6", PrimeCheck.isPrime(6));
    assertFalse("Test 8", PrimeCheck.isPrime(8));
    assertFalse("Test 128", PrimeCheck.isPrime(128));
  }
}
