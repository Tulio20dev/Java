public class Aluno extends Pessoa {

    //Atributos
    private int matricula;

    //Construtor
    public Aluno(String nome, String cpf, int matricula) {
        super(nome, cpf);
        this.matricula = (matricula);
    }

    //Getters
    public int getMatricula() {
        return matricula;
    }

    //Setters
    public void setMatricula(int novaMatricula) {
        matricula = novaMatricula;
    }
}