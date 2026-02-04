package ExerciciosLeet.vetores;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pares {
    public static void main(String[] args) {

        // Inputs: [1,2,3,1,1,3]
        // output: 4
        // pares: (0,3), (0,4), (3,4), (2,5)


        int[] array = new int[]{1,1,1,1};

        int pares = 0;
        Arrays.sort(array);

        for (int x=0; x < array.length; x++) {

            //int i = array[x];

            int valTemp = array[x];
            int n = x+1;

            while (n < array.length && valTemp == array[n]) {
                pares += 1;
                n += 1;
            }

        }
        System.out.println(pares);


    }
}
