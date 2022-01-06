package view;

import model_controller.Crud;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Crud crud = new Crud();

    public static void main(String[] args) {
        int op;

        while(true) {
            System.out.println("\n=========== CRUD DE PESSOAS ===========");
            System.out.println("1 - Cadastrar nova pessoa"
                    + "\n2 - Visualizar uma pessoa"
                    + "\n3 - Listar pessoas"
                    + "\n4 - Atualizar pessoa"
                    + "\n5 - Remover pessoa por nome"
                    + "\n6 - Remover pessoa por índice"
                    + "\n0 - Encerrar programa");
            System.out.print("Escolha uma opção: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 0:
                    sair();
                    break;
                case 1:
                    cadastrarPessoa();
                    break;
                case 2:
                    visualizarPessoa();
                    break;
                case 3:
                    listarPessoa();
                    break;
                case 4:
                    atualizarPessoa();
                    break;
                case 5:
                    removerPessoaNome();
                    break;
                case 6:
                    removerPessoaIndice();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void cadastrarPessoa() {
        System.out.println("==> CADASTRO DE ALUNO <==\n" +
                "Informe os dados solicitados:");

        System.out.println("Nome:");
        String nome = scan.nextLine();

        System.out.println("Telefone:");
        String telefone = scan.nextLine();

        boolean cadastroValido = false;

        while(!cadastroValido) {
            System.out.println("Data de nascimento (DD/MM/AAAA):");
            String nascimento = scan.nextLine();

            cadastroValido = crud.cadastrarPessoa(nome, telefone, nascimento);

            if (cadastroValido) {
                System.out.println("Pessoa cadastrada com sucesso!");
            } else {
                System.out.println("Insira uma data válida com o formato \"DD/MM/AAAA\"");
            }
        }
    }

    public static void visualizarPessoa() {
        System.out.println("Visualizar um aluno");
    }

    public static void listarPessoa() {
        System.out.println("\n==> LISTAR ALUNOS <==");
        crud.listarPessoas();
    }

    public static void atualizarPessoa() {
        System.out.println("\n==> ATUALIZAR ALUNO <==");
    }

    public static void removerPessoaNome() {
        System.out.println("\n==> REMOVER ALUNO POR NOME <==");

        System.out.print("Informe o nome da pessoa para removê-la: ");
        String nome = scan.nextLine();

        crud.removerPessoaPorNome(nome);
    }

    public static void removerPessoaIndice() {
        System.out.println("\n==> REMOVER ALUNO POR ÍNDICE <==");
        System.out.print("Informe o índice da pessoa para removê-la: ");
        int i = scan.nextInt();

        crud.removerPessoaPorIndice(i);
    }

    public static void sair() {
        System.out.println("\n==> Aplicação encerrada! <==");
        System.exit(0);
    }
}
