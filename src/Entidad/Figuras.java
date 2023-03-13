package Entidad;
//al usar abstract lo que hacemos es generar funciones que no se implementan en esta clase(padre) pero
//pero si lo hacen en las clases hijas 
public abstract class Figuras {
    private String color;
    private int numeroLados;

    public Figuras(String color, int numeroLados) {
        this.color = color;
        this.numeroLados = numeroLados;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    public static void detectarFigura(int numLados) {
        switch (numLados) {
            case 3:
                System.out.println("Es un triángulo.");
                break;
            case 4:
                System.out.println("Es un cuadrilátero.");
                break;
            case 5:
                System.out.println("Es un pentágono.");
                break;
            case 6:
                System.out.println("Es un hexágono.");
                break;
            default:
                System.out.println("Figura no contemplada.");
        }
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

}