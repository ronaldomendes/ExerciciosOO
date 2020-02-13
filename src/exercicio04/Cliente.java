package exercicio04;

public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String nome, int idade, String cidadeNascimento, String cpf) {
        super(nome, idade, cidadeNascimento);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.print(String.format(" - CPF: %s \n", getCpf()));
    }
}
