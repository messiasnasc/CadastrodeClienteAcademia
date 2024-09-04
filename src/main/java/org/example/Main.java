package org.example;

import entities.Academia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Academia academia = new Academia();

        System.out.println("Bem-vindo ao sistema de pagamentos da Academia!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Realizar Pagamento");
            System.out.println("3. Exibir Clientes");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o valor da mensalidade:");
                    double valorMensalidade = scanner.nextDouble();
                    academia.adicionarCliente(nome, valorMensalidade);
                    System.out.println("Cliente adicionado com sucesso.");
                    break;

                case 2:
                    System.out.println("Digite o nome do cliente que vai realizar o pagamento:");
                    String nomeCliente = scanner.nextLine();
                    academia.realizarPagamento(nomeCliente);
                    break;

                case 3:
                    academia.exibirClientes();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}