/**
 * Complexidade O(n)
 */

public class ProgDinamicoBottomUp {
    public static void main(String[] args) {
        int numero = 65;
        long resultado = calcularFatorialBottomUp(numero);

        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }

    public static long calcularFatorialBottomUp(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número deve ser não negativo.");
        }

        long[] dp = new long[numero + 1];
        dp[0] = 1;

        for (int i = 1; i <= numero; i++) {
            dp[i] = i * dp[i - 1];
        }

        return dp[numero];
    }
}
