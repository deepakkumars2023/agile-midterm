import org.junit.Test;
import static org.junit.Assert.*;

public class EvenOddTest {
    @Test
    public void testEven() {
        assertEquals("Even", EvenOdd.checkEvenOdd(2));
    }

    @Test
    public void testOdd() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(3));
    }
}