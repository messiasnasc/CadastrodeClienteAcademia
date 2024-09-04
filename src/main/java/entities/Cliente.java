package entities;

public class Cliente {
    private String nome;
    private double valorMensalidade;
    private boolean pagamentoRealizado;

    public Cliente(String nome, double valorMensalidade) {
        this.nome = nome;
        this.valorMensalidade = valorMensalidade;
        this.pagamentoRealizado = false;
    }

    public String getNome() {
        return nome;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public boolean isPagamentoRealizado() {
        return pagamentoRealizado;
    }

    public void realizarPagamento() {
        pagamentoRealizado = true;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Mensalidade: R$ " + valorMensalidade +
                ", Pagamento Realizado: " + (pagamentoRealizado ? "Sim" : "Não");
    }
}