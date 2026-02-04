package dados;

public class Invertendo {
    public static void main(String[] args) {
        String nome = "elder";
        String inverse = "";
        for (int i= nome.length() - 1; i>=0; i--) {
            inverse += nome.charAt(i);
        }
        System.out.println(inverse);

        System.out.println("===========");
        
        String texto = "computador";
        String invertido = new StringBuilder(texto).reverse().toString();

        System.out.println(invertido);
    }
}
