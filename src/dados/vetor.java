package dados;

public class vetor {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        int soma = 0;
        int z = 10;
        for (int i=0; i<z; i++) {
            for (int n=0; n<z; n++){
                soma += n;
            }

            soma += i;
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo: "+ (fim - inicio) + " ms");

    }
}
