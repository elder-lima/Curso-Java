package dados;

import java.util.ArrayList;
import java.util.List;

public class Inverter {
    public static void main(String[] args) {

        int numero = 123;

        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;        // pega o último dígito
            System.out.println(digito);
            invertido = invertido * 10 + digito;
            numero = numero / 10;            // remove o último dígito
        }

        System.out.println(invertido);


    }
}
