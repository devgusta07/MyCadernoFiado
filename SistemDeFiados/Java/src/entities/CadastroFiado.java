package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroFiado {

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void Menu(){
        int opecao;

        do {
            System.out.println("-------- CADASTRO CREDITARIO --------");
            System.out.println("1 Cadastra Creditario");
            System.out.println("2 Lista de Creditarios");
            System.out.println("3 Filtrar Creditario");
            System.out.println("4 Remover Creditario");
            System.out.println("0 Para encerrar");
            System.out.print("Opeção: ");

            opecao = sc.nextInt();
            sc.nextLine();

            switch (opecao){

                case 1:
                    CadastraCreditario();
                    break;

                case 2:
                    ListaDeCreditarios();
                    break;

                case 3:
                    FiltrarCreditario();
                    break;

                case 4:
                    RemoverCreditario();
                    break;


                case 0:
                    System.out.println("Encerrando o Sistema...");
                    break;

                default:
                    System.out.println("Opeção Invalida!!");
                    break;

            }

        }
        while (opecao != 0);

    }

    public void CadastraCreditario(){

        System.out.print("\nNome: ");
        String nome = sc.nextLine();
        System.out.print("Cpf: ");
        String cpf = sc.nextLine();
        System.out.print("Creditario: ");
        double creditario = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nCadastrado com Sucesso! \n");

        Cliente credito = new Cliente(nome, cpf, creditario);

        clientes.add(credito);

    }

    public void ListaDeCreditarios(){

        System.out.println("\n-------- Creditarios Listados -------");

        for (Cliente c : clientes){
            System.out.println(c);
            System.out.println("-----------------------");
        }

        System.out.println();

    }

    public void FiltrarCreditario(){

        System.out.print("\nInforme o cpf do creditario: ");
        String cpfDigitado = sc.nextLine();

        Cliente clienteEncon = clientes.stream().
                filter(c -> c.getCpf().equals(cpfDigitado))
                .findFirst().orElse(null);

        if (clienteEncon == null){
            System.out.println("\nCliente Nao encontrado!!\n");

        }

        else {
            System.out.println("\nCliente do Cpf: "+ cpfDigitado);
            System.out.println("\n"+ clienteEncon);
            System.out.println();


        }
    }

    public void RemoverCreditario(){

        System.out.print("\nInforme o Cpf do Creditario que deseja remover: ");
        String removeCpf = sc.nextLine();

        Cliente clienteEncon = clientes.stream().
                filter(c -> c.getCpf().equals(removeCpf))
                .findFirst().orElse(null);

        if(clienteEncon == null){
            System.out.println("\nCpf não encontrado!!");
        }
        else {
            clientes.remove(clienteEncon);
            System.out.println("\nCreditario: "+ clienteEncon.getName() + ", removido");
            System.out.println("----- Lista Atualizada -----");
            ListaDeCreditarios();
        }
    }




}
