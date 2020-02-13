package exercicio01;

public class Programador {
    private String nome;
    private boolean estaCodificando;
    private String LinguagemProgram;

    public void desenvolverProjeto() {
        if (estaCodificando) {
            System.out.println("Desenvolvendo um novo projeto...");
        } else {
            System.out.println("Ainda não tenho um projeto...");
        }
    }

    public void entregarProjeto() {
        if (estaCodificando) {
            System.out.println("Projeto finalizado...");
        } else {
            System.out.println("Ainda não iniciei um projeto...");
        }
    }

    public Programador(String nome, boolean estaCodificando, String linguagemProgram) {
        this.nome = nome;
        this.estaCodificando = estaCodificando;
        LinguagemProgram = linguagemProgram;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getEstaCodificando() {
        return estaCodificando;
    }

    public void setEstaCodificando(boolean estaCodificando) {
        this.estaCodificando = estaCodificando;
    }

    public String getLinguagemProgram() {
        return LinguagemProgram;
    }

    public void setLinguagemProgram(String linguagemProgram) {
        LinguagemProgram = linguagemProgram;
    }
}
