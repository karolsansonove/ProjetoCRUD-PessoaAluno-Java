package view;

import model_controller.Crud;
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
                    + "\n7 - Atribuir nota final e criar novo aluno"
                    + "\n8 - Visualizar um aluno"
                    + "\n9 - Listar alunos"
                    + "\n10 - Atualizar nota final"
                    + "\n11 - Remover aluno"
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
                    listarPessoas();
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
                case 7:
                    atribuirNotaFinal();
                    break;
                case 8:
                    visualizarAluno();
                    break;
                case 9:
                    listarAlunos();
                    break;
                case 10:
                    atualizarNotaFinal();
                    break;
                case 11:
                    removerAluno();
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
        System.out.println("\n==> VISUALIZAR PESSOA <==");
        System.out.print("Informe o índice da pessoa: ");
        int i = scan.nextInt();
        scan.nextLine();

        crud.visualizarPessoaIndice(i);
    }

    public static void listarPessoas() {
        System.out.println("\n==> LISTAR PESSOAS <==");
        crud.listarPessoas();
    }

    public static void atualizarPessoa() {
        boolean result;

        System.out.println("\n==> ATUALIZAR PESSOA <==\n" +
                "Atualize os dados solicitados:");

        System.out.println("Nome:");
        String nome = scan.nextLine();

        System.out.println("Telefone:");
        String telefone = scan.nextLine();

        do {
            System.out.println("Data de nascimento:");
            String nascimento = scan.nextLine();

            System.out.println("Índice:");
            int i = scan.nextInt();
            scan.nextLine();

            result = crud.atualizarPessoa(i, nome, telefone, nascimento);
        } while (!result);

    }

    public static void removerPessoaNome() {
        System.out.println("\n==> REMOVER PESSOA POR NOME <==");

        System.out.print("Informe o nome da pessoa para removê-la: ");
        String nome = scan.nextLine();

        crud.removerPessoaPorNome(nome);
    }

    public static void removerPessoaIndice() {
        System.out.println("\n==> REMOVER PESSOA POR ÍNDICE <==");
        System.out.print("Informe o índice da pessoa para removê-la: ");
        int i = scan.nextInt();
        scan.nextLine();

        crud.removerPessoaPorIndice(i);
    }

    public static void atribuirNotaFinal() {
        System.out.println("\n==> ATRIBUIR NOTA FINAL <==");

        System.out.print("Informe o índice a receber nota final: ");
        int i = scan.nextInt();
        scan.nextLine();

        System.out.print("Informe a nota final: ");
        float nota = scan.nextFloat();

        crud.atribuirNotaFinal(i, nota);
    }

    private static void visualizarAluno() {
        System.out.println("\n==> VISUALIZAR ALUNO <==");
        System.out.print("Informe o índice do aluno: ");
        int i = scan.nextInt();
        scan.nextLine();

        crud.visualizarAlunoIndice(i);
    }

    private static void listarAlunos() {
        System.out.println("\n==> LISTA DE ALUNOS <==");
        crud.listarAlunos();
    }

    private static void atualizarNotaFinal() {
        System.out.println("\n==> ATUALIZAR NOTA FINAL <==\nInforme os dados para atualizar:");

        System.out.print("Índice: ");
        int i = scan.nextInt();
        scan.nextLine();

        System.out.print("Nova nota: ");
        float nota = scan.nextFloat();
        scan.nextLine();

        crud.atualizarNota(i, nota);
    }

    private static void removerAluno() {
        System.out.println("\n==> REMOVER ALUNO <==");
        System.out.print("Informe o índice do aluno a ser removido: ");
        int i = scan.nextInt();
        scan.nextLine();

        crud.removerAluno(i);
    }

    public static void sair() {
        System.out.println("\n==> Aplicação encerrada! <==");
        System.exit(0);
    }
}
