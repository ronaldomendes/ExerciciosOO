package exercicio02;

public class Triangulo {
    private double baseTriangulo;
    private double alturaTriangulo;

    public Triangulo(double baseTriangulo, double alturaTriangulo) {
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = alturaTriangulo;
    }

    public double getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(double baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public double getAlturaTriangulo() {
        return alturaTriangulo;
    }

    public void setAlturaTriangulo(double alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
    }

    public void baseTriangulo () {
        double result = (getBaseTriangulo() * getAlturaTriangulo()) / 2;
        System.out.println(result);
    }
}
