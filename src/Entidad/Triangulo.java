package Entidad;

public class Triangulo extends Figuras{
    private double base;
    private double altura;

    public Triangulo(String color, int numeroLados, double base, double altura) {
        super(color, numeroLados);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double v = (base * altura) / 2;
        return v;
    }

    @Override
    public double calcularPerimetro() {
        return base * 3;
    }

    @Override
    public void imprimir() {

    }


    public static boolean esTriangulo(Figuras f) {
        if (f.getNumeroLados() == 3) {
            return true;
        } else {
            return false;
        }
    }

}
