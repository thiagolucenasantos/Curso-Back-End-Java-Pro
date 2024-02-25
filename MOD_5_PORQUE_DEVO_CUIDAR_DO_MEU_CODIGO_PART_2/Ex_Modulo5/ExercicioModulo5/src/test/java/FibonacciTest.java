import org.example.fibonacci.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void testeFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(55, fibonacci.encontrarElemento(10));
    }
}
