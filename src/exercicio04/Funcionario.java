package exercicio04;

public class Funcionario extends Pessoa {
    private String numMatricula;


    public Funcionario(String nome, int idade, String cidadeNascimento, String numMatricula) {
        super(nome, idade, cidadeNascimento);
        this.numMatricula = numMatricula;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.print(String.format(" - Matrícula: %s\n", getNumMatricula()));
    }
}
