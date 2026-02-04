package aulas;

public class vetor {
    public static void main(String[] args) {

        String[] vetor = new String[] {"Maria", "Bob", "Alex"};
        int[] array = new int[]{10,20,30,40,50,60};
        int[] array2 = new int[5];

        System.out.println(array.length);
        System.out.println(array2.length);



        for (int x : array2) {
            System.out.println(x);
        }

        for (String n : vetor) {
            System.out.println(n);
        }

    }
}
