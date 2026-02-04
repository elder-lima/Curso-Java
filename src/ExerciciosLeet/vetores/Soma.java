package ExerciciosLeet.vetores;

import java.util.Stack;

public class Soma {
    public static void main(String[] args) {

        int[] array = new int[]{-5, -2, -3, -1};
        Soma soma = new Soma();
        System.out.println(soma.soma2(array));
    }

    public int soma(int[] array) {
        if (array.length < 3) {
            throw new IllegalArgumentException("Array precisa ter pelo menos 3 elementos");
        }

        int windowSum = array[0] + array[1] + array[2];
        int max = windowSum;

        for (int i = 3; i < array.length; i++) {
            windowSum = windowSum - array[i - 3] + array[i];
            max = Math.max(max, windowSum);
        }

        return max;
    }

   public int soma2(int[] array) {

        if (array.length < 3) {
           throw new IllegalArgumentException("Array precisa ter pelo menos 3 elementos");
        }

        int max = Integer.MIN_VALUE;
        int esquerda = 0;
        int cont = 0;

        for (int direita=0; direita < array.length; direita++) {

            cont++;

            if(cont == 3) {
                max = Math.max(max, array[esquerda] + array[esquerda+1] + array[direita]);
                esquerda++;
                cont--;
            }

        }

        return max;
   }
}
