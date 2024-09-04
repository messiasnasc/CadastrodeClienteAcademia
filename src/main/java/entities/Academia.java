package entities;

import java.util.ArrayList;

public class Academia {
    private ArrayList<Cliente> clientes;

    public Academia() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(String nome, double valorMensalidade) {
        Cliente cliente = new Cliente(nome, valorMensalidade);
        clientes.add(cliente);
    }

    public void realizarPagamento(String nomeCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nomeCliente)) {
                cliente.realizarPagamento();
                System.out.println("Pagamento realizado com sucesso para " + nomeCliente);
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    public void exibirClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}