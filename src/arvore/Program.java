package arvore;

public class Program {
    public static void main(String[] args) {

        Folha folha = new Folha(5);
        Arvore arvore = new Arvore(folha);
        arvore.inserir(new Folha(18));
        arvore.inserir(new Folha(4));
        arvore.inserir(new Folha(22));
        arvore.inserir(new Folha(23));
        arvore.inserir(new Folha(2));
        arvore.inserir(new Folha(50));
        arvore.inserir(new Folha(7));
        arvore.inserir(new Folha(6));


    }
}

class Folha {

    private int value;

    public Folha(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}

class Arvore {

    private Folha folha;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore(Folha folha) {
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }

    public Folha getFolha() {
        return this.folha;
    }

    public Arvore getEsquerda() {
        return this.esquerda;
    }

    public Arvore getDireita() {
        return this.direita;
    }

    public void inserir(Folha novaArvore) {
        if (novaArvore.getValue() < folha.getValue()) {
            if (esquerda == null) {
                this.esquerda = new Arvore(novaArvore);
                System.out.println("Valor "+novaArvore.getValue()+" esta a esquerda de "+folha.getValue());
            }else {
                this.esquerda.inserir(novaArvore);
            }
        }else {
            if (direita == null) {
                this.direita = new Arvore(novaArvore);
                System.out.println("Valor "+novaArvore.getValue()+" esta a direita de "+folha.getValue());
            }else {
                this.direita.inserir(novaArvore);
            }
        }
    }


}