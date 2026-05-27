import java.util.*;

public class arrayList {
     public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
         ArrayList<String> nomes = new ArrayList<>();
         int cont;
         do {
            System.err.println("Digite um nomes: ");
            String nome = sc.nextLine();
            nomes.add(nome);
            System.out.println("desja grava mais nomes? \n1-SIM \n2-NÂO");
            cont = sc.nextInt();
            sc.nextLine();
         } while (cont==1);
         for (String i: nomes)
            System.out.println(i);
        sc.close();
     }
    
}
