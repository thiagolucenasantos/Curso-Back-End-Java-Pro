import java.util.HashMap;
import java.util.Map;

/**
 * Foi possível ir até O fatorial é 65 é: -9223372036854775808
 * Acima de 65 o retorno é 0
 *
 * Complexidade O(n)
 * Tanto a solução com memoização (top-down) quanto a solução bottom-up têm complexidade de tempo linear
  * O(n)). Isso ocorre porque cada valor é calculado apenas uma vez e armazenado para reutilização, eliminando
 * a repetição de cálculos.
 */

public class ProgDinamicaTopDown {
private static Map<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        int numero = 65;
        long resultado = calcularFatorialTopDown(numero);
        System.out.println("O fatorial é " + numero + " é: " + resultado);
    }

    public static long calcularFatorialTopDown(int numero) {
        if (numero < 0) {
            System.out.println("Numero deve ser negativo");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
            if (memo.containsKey(numero)) {
                return memo.get(numero);
        }else {
                long resultado = numero * calcularFatorialTopDown(numero - 1);
                memo.put(numero, resultado);
                return resultado;
            }

        }
    }

