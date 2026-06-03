import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nomeAluno = sc.nextLine();
        System.out.println("Digite a maticula do aluno");
        int matriculaAluno = sc.nextInt();
        Aluno novoAluno = new Aluno();
        novoAluno.setNome(nomeAluno);
        novoAluno.setMatricula(matriculaAluno);
        novoAluno.exibirInformaçoes();
        sc.close();
    }

}