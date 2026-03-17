package exerc_leet;

public class Arvore {
    public static void main(String[] args) {

        int num = 9;
        arvore(num);

    }
    public static void arvore(int num) {

        for (int x = 1; x <= num; x+=2) {

            for (int j=0; j < (num - x) / 2; j++) {
                System.out.print(' ');
            }

            for (int i=1; i <= x; i++){
                System.out.print('*');
            }

            System.out.println();

        }

        for (int j=0; j < (num - 1) / 2; j++) {
            System.out.print(' ');
        }

        System.out.println('*');

        for (int j=0; j < (num - 3) /2; j++) {
            System.out.print(' ');
        }

        System.out.println("***");

    }
}
