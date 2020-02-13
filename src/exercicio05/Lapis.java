package exercicio05;

public class Lapis implements Escrita {
    private String ehFeitoDe;
    private String escreveCom;

    public Lapis() {
        this.ehFeitoDe = "Madeira";
        this.escreveCom = "Grafite";
    }

    public String getEhFeitoDe() {
        return ehFeitoDe;
    }

    private void setEhFeitoDe(String ehFeitoDe) {
        this.ehFeitoDe = ehFeitoDe;
    }

    public String getEscreveCom() {
        return escreveCom;
    }

    private void setEscreveCom(String escreveCom) {
        this.escreveCom = escreveCom;
    }

    @Override
    public void escrever() {
        System.out.println(String.format("Escrevendo com %s", getEscreveCom()));
    }
}
