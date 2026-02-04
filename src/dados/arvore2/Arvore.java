package dados.arvore2;

public class Arvore {

    private Folha folha;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore() {
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }

    public Arvore(Folha folha) {
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }

    public boolean isEmpty() {
        return this.folha == null;
    }

    public void inserir(Folha novaFolha) {
        if (isEmpty()) {
            this.folha = novaFolha;
        }
        else {
            if (novaFolha.getValor() < folha.getValor()) {
                if (this.esquerda == null) {
                    this.esquerda = new Arvore(novaFolha);
                    System.out.println("O valor "+novaFolha.getValor()+" esta a esquerda de "+folha.getValor());
                }else {
                    this.esquerda.inserir(novaFolha);
                }
            } else if (novaFolha.getValor() > folha.getValor()) {
                if (this.direita == null) {
                    this.direita = new Arvore(novaFolha);
                    System.out.println("O valor "+novaFolha.getValor()+" esta a direita de "+folha.getValor());
                }
                else {
                    this.direita.inserir(novaFolha);
                }
            }

        }

    }
}
