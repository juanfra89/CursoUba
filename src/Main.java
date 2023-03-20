import Entidad.Cuadrado;
import Entidad.Imprimir;
import Entidad.Triangulo;

import static Entidad.Figuras.detectarFigura;

//import static Entidad.Triangulo.esTriangulo;

public class Main {
    public static void main(String[] args) {


        Triangulo t = new Triangulo("Rojo", 3, 10.0, 5.0);
        Cuadrado c = new Cuadrado(4,2);
        System.out.println("Implementacion T");
        Imprimir<Triangulo> trianguloImprimir = new Imprimir<>(t);
        Imprimir<Cuadrado>cuadradoImprimir= new Imprimir<>(c);


        String color = t.getColor();
        int numeroLados = t.getNumeroLados();
        double base = t.getBase();
        double altura = t.getAltura();


        System.out.println("Triangulo:");
        System.out.println("Color: " + color);
        System.out.println("Numero de lados: " + numeroLados);
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);


        t.setColor("Azul");
        t.setNumeroLados(3);
        t.setBase(8.0);
        t.setAltura(4.0);


        color = t.getColor();
        numeroLados = t.getNumeroLados();
        base = t.getBase();
        altura = t.getAltura();


        System.out.println("Triangulo modificado:");
        System.out.println("Color: " + color);
        System.out.println("Numero de lados: " + numeroLados);
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
       // System.out.println( "el objeto es un triangulo "+esTriangulo(t));
        detectarFigura(5);
        System.out.println("el perimetro del triangulo es "+ t.calcularPerimetro());
        System.out.println("el area del triangulo es "+ t.calcularArea());
        System.out.println("el perimetro del cuadrado es "+ c.calcularPerimetro());
        System.out.println("el area del cuadrado es "+ t.calcularPerimetro());
    }
    }
