package br.com.vinicius.banco;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Vinicius Vogel";
        String tipoConta = "Corrente";
        double saldo = 93000;
        double deposito = 0;
        double transferir = 0;

        System.out.println("============================");
        System.out.println("Dados iniciais do Cliente:\n ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.printf("Saldo: R$%.2f%n", saldo);
        System.out.println("============================\n");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Operações\n");
            System.out.println("1 - Consultar Saldos");
            System.out.println("2 - Depósito");
            System.out.println("3 - Transferência");
            System.out.println("4 - Sair\n");
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("============================");
                    System.out.println("Nome: " + nome);
                    System.out.println("Tipo da Conta: " + tipoConta);
                    System.out.printf("Saldo: R$%.2f%n", saldo);
                    System.out.println("============================");
                    break;
                case 2:
                    System.out.println("============================");
                    System.out.println("Qual valor deseja depositar: ");
                    deposito = sc.nextDouble();
                    System.out.println("============================");
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.printf("Saldo atualizado: R$%.2f%n", (saldo = (saldo + deposito)));
                    System.out.println("============================");
                    break;
                case 3:
                    System.out.println("============================");
                    System.out.println("Qual valor deseja transferir: ");
                    transferir = sc.nextDouble();

                    if (transferir > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        System.out.println("Transferência realizado com sucesso!");
                        System.out.printf("Saldo atualizado: R$%.2f%n", (saldo = (saldo - transferir)));
                        System.out.println("============================");
                    }
                    break;
                case 4:
                    System.out.println("Sair");
                    sc.close();
                    break;
            }
        }
    }
}
