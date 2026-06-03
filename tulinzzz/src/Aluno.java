public class Aluno {
    //Atributos
    private String nome;
    private int matricula;
    //Contrututores
    public Aluno(String nome, int matricula){
    this.nome = nome; 
    this.matricula = matricula;
}
public Aluno(){

}
//getters
public String getNome(){
    return nome;
}
public int getMatricula(){
    return  matricula;
}
//setters
public void setNome(String novoNome){
    nome = novoNome;
}
public void setMatricula (int novaMatricula){
    matricula = novaMatricula;
}
 //metodos
    public void exibirInformaçoes() {
        System.out.println("nome" + nome);
        System.out.println("Matricula" + matricula);
    }
}
