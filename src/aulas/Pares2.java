package aulas;

import java.util.Arrays;

public class Pares2 {
    public static void main(String[] args) {

        // Inputs: [1,2,3,1,1,3]
        // output: 4
        // pares: (0,3), (0,4), (3,4), (2,5)


        //int[] array = new int[]{1,2,3,1,1,3};
        int[] array = new int[]{1,1,1,1};
        //System.out.println(array.length);
        System.out.println(Arrays.toString(array));

        // Ordernação
        Arrays.sort(array);
        int pares = 0;

        for (int x=0; x < array.length; x++) {

            // dado indice
            int i = array[x];

            int valTemp = x;

            while (valTemp != array.length-1 && i == array[valTemp+1]) {
                pares++;
                valTemp++;
            }

        }

        System.out.println(pares);


    }
}
