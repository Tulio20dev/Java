
import java.util.Scanner;

public class Array{

    public static void (String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("quantos jogos deseja gerar");
        int quantidadeJogos = sc.nextInt();
        int[] jogo = new int[6];
        for (int i = 1; i <= quantidadeJogos; i++) {
            System.out.print("jogo" + i + ":");
            for (int ps = 0; ps < 6; ps++) {
                jogo[ps] = (int)(Math.random() * 60) + 1;
            }
            for (int ps = 0; ps < 6; ps++) {
                System.out.print(jogo[ps] + "" );
            }
            System.out.println();
        }
        sc.close();
    }
}