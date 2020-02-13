package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Creuza", 26, "São Paulo", "12345678910");
        Funcionario funcionario = new Funcionario("Godofredo", 31, "Curitiba", "1942A0");

        cliente.exibirDados();
        funcionario.exibirDados();
    }
}
