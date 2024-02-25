import org.example.calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculadoraTest {

    @Test
    public void testarAdicionar() {
        Calculadora calculadora = new Calculadora();
        assert calculadora.getAdicionar(4, 2) == 6;
        assert calculadora.getAdicionar(-3, 2) == -1;
    }

    @Test
    public void testarSubtrair() {
        Calculadora calculadora = new Calculadora();
        assertEquals(3, calculadora.getSubtrair(5, 2));
        assertEquals(-10, calculadora.getSubtrair(-6, 4));
    }

    @Test
    public void testarMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(8, calculadora.getMultiplicar(4, 2));
        assertEquals(-10, calculadora.getMultiplicar(-5, 2));
    }

    @Test
    public void testarDividir() throws IllegalAccessException {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.getDividir(4, 2));
        assertEquals(-2, calculadora.getDividir(-6, 3));
        assertEquals(2, calculadora.getDividir(5, 2)); // divisão inteira resultado será 2

    }
}
