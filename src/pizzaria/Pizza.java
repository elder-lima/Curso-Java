package pizzaria;

import java.math.BigDecimal;

public class Pizza {

    private String nome;
    private BigDecimal preco = BigDecimal.ZERO;

    public Pizza() {
    }

    public Pizza(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+". Preço: "+preco;
    }
}
