package algoritmoGuloso;

import java.util.HashMap;
import java.util.Map;

public class TrocoAlgoritmoGuloso {


    public static void main(String[] args) {
        int quantia = 18;
        Map<Integer, Integer> moedasDisponiveis = new HashMap<>();
        moedasDisponiveis.put(5, 0); // Inicializamos com zero de cada moeda
        moedasDisponiveis.put(2, 0);
        moedasDisponiveis.put(1, 0);

        calcularTroco(quantia, moedasDisponiveis);

        // Imprimir o resultado
        System.out.println("Troco:");
        for (Map.Entry<Integer, Integer> entry : moedasDisponiveis.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getValue() + " moeda(s) de " + entry.getKey());
            }
        }
    }

    public static void calcularTroco(int quantia, Map<Integer, Integer> moedasDisponiveis) {
        int[] valoresMoedas = {5, 2, 1};

        for (int valorMoeda : valoresMoedas) {
            if (quantia >= valorMoeda) {
                int quantidadeMoedas = quantia / valorMoeda;
                moedasDisponiveis.put(valorMoeda, quantidadeMoedas);
                quantia %= valorMoeda;
            }
        }
    }
}


