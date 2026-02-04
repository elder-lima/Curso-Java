package dados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BuscaBinaria {
    public static int buscaBinaria(int[] arr, int alvo) {
        int inicio = 0;
        int fim = arr.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (arr[meio] == alvo)
                return meio;
            else if (arr[meio] < alvo)
                inicio = meio + 1;
            else
                fim = meio - 1;
        }
        return -1;
    }

    public static class ClasseR {
        public void retorno() {
            System.out.println("retornooo");
        }
    }

    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11};
        System.out.println(buscaBinaria(numeros, 7)); // O(log n)

        List<Integer> lista = Arrays.asList(1,2,3,5,7,1,2);
        String stringUnica = lista.stream().map(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(stringUnica);

    }

}
