package Entidad;

public class Cuadrado extends Figuras{
    private double lado;

    public Cuadrado( int numeroLados, double lado) {
        super("azul",4);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado *lado ;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public void imprimir() {

    }

    @Override
    public double calculoDePerimetro() {
        return 4 * lado;
    }

    @Override
    public double calculoDeArea() {
        return lado * lado;
    }


}
