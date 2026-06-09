public class pessoa {
    //atribuos
    protected String nome;
    protected String cpf;
    //construtores
    public Pessoa (String nome,String cpf ) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public Pessoa (){

    }
    //getters
    public String getNome(){
        return nome;
    }
    public String getCPF(){
        return cpf;
    }
    //setters
    public void setNome (String novoNome){
        nome = novoNome;
    }
    public void setCPF (String novoCPF){
        cpf = novoCPF;
    }
    //metodos
    public void exibeMensagem(){
        System.out.println("pessoa cadastrada com sucesso");
    }
    public String validaCPF(String cpfValidar){
        if(cpfValidar.length() != 11){
            return "CPF Invalido";
        }else{
            return "cpf aceito";
        }
    }

}
