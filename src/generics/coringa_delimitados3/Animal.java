package generics.coringa_delimitados3;

abstract class Animal {

    void emitirSom(){
        System.out.println("Som genericooo");
    }

    public abstract void fazerSom(); // método abstrato (sem corpo)

    public void dormir() {
        System.out.println("O animal está dormindo");
    }

}
class Cachorro extends Animal {

    public static void main(String[] args) {
//        Cachorro a = new Cachorro(); // ✅ instanciando a SUBCLASSE
//        a.fazerSom();
//        a.dormir();

//        String a = "maria";
//        String b = "maria";
//        System.out.println(a.equals(b));

        boolean condicao = true;

        String mensagem = condicao ? "Verdadeiro" : "Falso";
        System.out.println(mensagem);



                       // "O animal está dormindo"
    }

    @Override
    void emitirSom() {
        super.emitirSom();
    }
    

    @Override
    public void fazerSom() {
        System.out.println("O cachorro late: au au!");
    }
}