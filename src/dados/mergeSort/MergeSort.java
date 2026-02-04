package dados.mergeSort;

public class MergeSort {

    // Método principal de ordenação
    public static void mergeSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            // Divide o array em duas partes
            mergeSort(array, inicio, meio);
            mergeSort(array, meio + 1, fim);

            // Combina as duas metades ordenadas
            merge(array, inicio, meio, fim);
        }
    }

    // Método que mescla duas partes ordenadas do array
    public static void merge(int[] array, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        // Copia dados para arrays temporários
        for (int i = 0; i < n1; i++)
            esquerda[i] = array[inicio + i];
        for (int j = 0; j < n2; j++)
            direita[j] = array[meio + 1 + j];

        int i = 0, j = 0;
        int k = inicio;

        // Mescla os arrays temporários de volta ao array original
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                array[k] = esquerda[i];
                i++;
            } else {
                array[k] = direita[j];
                j++;
            }
            k++;
        }

        // Copia o que sobrou (se houver) da esquerda
        while (i < n1) {
            array[k] = esquerda[i];
            i++;
            k++;
        }

        // Copia o que sobrou (se houver) da direita
        while (j < n2) {
            array[k] = direita[j];
            j++;
            k++;
        }
    }

    // Método principal para testar
    public static void main(String[] args) {
        int[] numeros = { 38, 27, 43, 3, 9, 82, 10 };

        System.out.println("Array original:");
        imprimirArray(numeros);

        mergeSort(numeros, 0, numeros.length - 1);

        System.out.println("Array ordenado:");
        imprimirArray(numeros);
    }

    public static void imprimirArray(int[] array) {
        for (int num : array)
            System.out.print(num + " ");
        System.out.println();
    }
}

