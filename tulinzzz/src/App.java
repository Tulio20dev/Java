import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa");
        String nomePessoa = sc.nextLine();
        System.out.println("Digite o CPF da pessoa");
        String cpfPessoa = sc.nextLine();
        Pessoa novaPessoa = new Pessoa(nomePessoa,cpfPessoa);
        novaPessoa.exibeMensagem();
        system.out.println("digite seu apelido");
        String apelidoPessoa = sc.nextLine();
        novaPessoa.exibirNomeApelido(apelidoPessoa);
        System.out.println(novaPessoa.validaCPF(cpfPessoa));
        sc.close();
    }

}