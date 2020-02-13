package exercicio04;

public class Pessoa {
    private String nome;
    private int idade;
    private String cidadeNascimento;

    public Pessoa(String nome, int idade, String cidadeNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeNascimento = cidadeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public void exibirDados() {
        System.out.print(String.format("Nome: %s - Idade: %s - Natural de: %s", getNome(), getIdade(), getCidadeNascimento()));
    }
}
