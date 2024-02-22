package exBacktracking;
import java.util.ArrayList;
import java.util.List;
public class Backtracking {

        public static void main(String[] args) {
            int[] S = {1, 2, 3}; // Conjunto de elementos únicos
            int n = 2; // Tamanho dos subconjuntos desejados

            List<List<Integer>> subsets = calcularSubconjuntos(S, n);
            for (List<Integer> subset : subsets) {
                System.out.println(subset);
            }
        }

        public static List<List<Integer>> calcularSubconjuntos(int[] S, int n) {
            List<List<Integer>> subsets = new ArrayList<>();
            backtrack(S, n, 0, new ArrayList<>(), subsets);
            return subsets;
        }

        private static void backtrack(int[] S, int n, int start, List<Integer> current, List<List<Integer>> subsets) {
            if (current.size() == n) {
                subsets.add(new ArrayList<>(current));
                return;
            }

            for (int i = start; i < S.length; i++) {
                current.add(S[i]);
                backtrack(S, n, i + 1, current, subsets);
                current.remove(current.size() - 1);
            }
        }
    }


