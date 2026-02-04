package dados;

import java.util.Arrays;

public class NLogN {

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 4, 2};
        Arrays.sort(numeros); // Usa QuickSort ou MergeSort → O(n log n)
        System.out.println(Arrays.toString(numeros));
    }

}
