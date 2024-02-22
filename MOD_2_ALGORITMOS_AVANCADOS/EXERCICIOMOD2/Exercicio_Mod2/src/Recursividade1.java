import com.sun.tools.javac.Main;

/**
 * Foi possível ir até O fatorial é 65 é: -9223372036854775808
 * Acima de 65 o retorno é 0
 *
 * Complexidade O(2n)
 * A solução recursiva ingênua possui uma complexidade de tempo exponencial O(2n)
 *  o que resulta em um crescimento muito rápido, especialmente para valores grandes de n.
 */

public class Recursividade1 {
    public static void main(String[] args) {
        int numero = 65;
        long resultado = calcularFatorial(numero);
        System.out.println("O fatorial é " + numero + " é: " + resultado);
    }

    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            System.out.println("Numero deve ser negativo");
        }
        if (numero == 0 || numero == 1){
            return 1;
        }else {
            if (numero > 20){
                System.out.println("Número muito grando para o cálculo");
            }
            return numero * calcularFatorial(numero - 1);
        }
    }
}

