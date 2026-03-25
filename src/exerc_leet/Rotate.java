package exerc_leet;

import java.util.ArrayList;
import java.util.List;

public class Rotate {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        //System.out.println(arr);
        int d = 2;
        System.out.println(rotateLeft(d, arr));


    }
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here

        for(int x=0; x < d; x++) {

            int value = arr.get(0);
            arr.remove(0);
            arr.add(value);

        }

        return arr;
    }
}
