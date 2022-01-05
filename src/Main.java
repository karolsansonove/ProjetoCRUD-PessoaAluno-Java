import javax.xml.bind.SchemaOutputResolver;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

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

        System.out.println("Data de nascimento: ");
        Date nascimento = new Date();

    }

    public static void visualizarAluno() {
        System.out.println("Visualizar um aluno");
    }

    public static void listarAlunos() {
        System.out.println("Listar alunos");
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
}
