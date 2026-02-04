package ExerciciosLeet.vetores;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SlidingWindow {

    public static void main(String[] args) {

        int[] array = new int[]{0,0,0,0,0}; // Saída: 5
        //System.out.println(array.length);
        SlidingWindow slidingWindow = new SlidingWindow();
        System.out.println(slidingWindow.longestSubArray(array));
    }

    public int longestSubArray(int[] array) {

        int max = 0;
        int esquerda = 0;
        int zeros = 0;

        for (int direita = 0; direita < array.length; direita++) {

            int valAtual = array[direita];

            if (valAtual == 0) {
                zeros++;
            }

            while (zeros > 1) {
                if (array[esquerda] == 0) {
                    zeros--;
                }
                esquerda++;
            }

            max = Math.max(max, direita - esquerda);
        }

        return max;

    }

//    public static int longestSubarray(int[] nums) {
//        int esquerda = 0;
//        int zeros = 0;
//        int max = 0;
//
//        for (int direita = 0; direita < nums.length; direita++) {
//
//            if (nums[direita] == 0) {
//                zeros++;
//            }
//
//            // Se tiver mais de um zero, move a janela
//            while (zeros > 1) {
//                if (nums[esquerda] == 0) {
//                    zeros--;
//                }
//                esquerda++;
//            }
//
//            // -1 implícito (removendo um elemento)
//            max = Math.max(max, direita - esquerda);
//        }
//
//        return max;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(longestSubarray(new int[]{1,1,0,1})); // 3
//        System.out.println(longestSubarray(new int[]{0,1,1,1,0,1,1,0,1})); // 5
//    }

}
