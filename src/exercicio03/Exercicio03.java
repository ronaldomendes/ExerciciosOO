package exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        Livro livro = new Livro("Programando em Java", "Godofredo Souza", 592);

        // apenas os Getters estão públicos, os Setters são privados
        livro.getTitulo();
        livro.getAutor();
        livro.getNumPaginas();
//        livro.setAutor("teste");
        System.out.println((livro.getAutor()));
    }
}
