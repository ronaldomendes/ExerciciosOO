package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Programador prog01 = new Programador("Godofredo", false, "Javascript");
        Programador prog02 = new Programador("Ronaldo", true, "Java");
        Programador prog03 = new Programador("Zezinho", false, "PHP");

        prog01.desenvolverProjeto();
        prog02.desenvolverProjeto();
        prog02.entregarProjeto();
        prog01.entregarProjeto();
    }
}
