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
            System.out.println("=========== CRUD DE ALUNOS ===========");
            System.out.println("1 - Cadastrar novo aluno"
                    + "\n2 - Visualizar um aluno"
                    + "\n3 - Listar todos os alunos"
                    + "\n4 - Atualizar aluno"
                    + "\n5 - Remover aluno"
                    + "\n0 - Encerrar programa");
            System.out.print("Escolha uma opção: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 0:
                    sair();
                    break;
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    visualizarAluno();
                    break;
                case 3:
                    listarAlunos();
                    break;
                case 4:
                    atualizarAluno();
                    break;
                case 5:
                    removerAluno();
                    break;
                case 6:
                    teste();
                    break;
                case 7:
                    teste2();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void cadastrarAluno() {
        System.out.println("==> CADASTRO DE ALUNO <==\n" +
                "Informe os dados solicitados:");

        System.out.print("Nome: ");
        String nome = scan.nextLine();

        System.out.println("Telefone: ");
        String telefone = scan.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date nascimentoDate = new Date();
        boolean cadastroValido = false;

        while(!cadastroValido) {
            System.out.println("Data de nascimento: (DD/MM/AAAA)");
            String nascimento = scan.nextLine();

            cadastroValido = crud.cadastrarPessoa(nome, telefone, nascimento);

            if (cadastroValido) {
                System.out.println("Pessoa cadastrada com sucesso!");
            } else {
                System.out.println("Insira uma data válida com o formato \"DD/MM/AAAA\"");
            }
        }
    }

    public static void visualizarAluno() {
        System.out.println("Visualizar um aluno");
    }

    public static void listarAlunos() {
        System.out.println("==> LISTAR ALUNOS <==");

    }

    public static void atualizarAluno() {
        System.out.println("Atualizar aluno");
    }

    public static void removerAluno() {
        System.out.println("Remover aluno");
    }

    public static void sair() {
        System.out.println("==> Aplicação encerrada! <==");
        System.exit(0);
    }

    public static void teste() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        String dataString = "05/13/2022";
        try {
            Date dataDate = sdf.parse(dataString);
            System.out.println(sdf.format(dataDate));
            System.out.println(dataDate);
        } catch (ParseException e) {
            System.out.println("Insira a data no formato \"DD/MM/AAAA\".");
        }
    }

    public static void teste2() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date dataDate = new Date();
        System.out.println(sdf.format(dataDate));
    }
}
