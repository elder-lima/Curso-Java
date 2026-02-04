package enums;

public enum Pedido {

    PENDENTE("Aguardando pagamento", false),
    PAGO("Pago com sucesso", true),
    CANCELADO("Cancelado pelo usuário", false);

    private String mensagem;
    private boolean finalizado;

    Pedido(String mensagem, boolean finalizado) {
        this.mensagem = mensagem;   
        this.finalizado = finalizado;
    }

    public String getMensagem() {
        return mensagem;
    }

    public boolean isFinalizado() {
        return finalizado;
    }
}
