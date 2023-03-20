package Entidad;
//crear nueva clase
//llamada impresora
//recibir un generico extendido de Figura
//imprimira cuaquiera de las figuras en cuestion y sera llamado desde main
public class Imprimir <T extends Figuras>{

    private T figura;

    public Imprimir(T figura) {
        this.figura = figura;
    }

    public void imprimirFigura() {
        figura.imprimir();
    }
}
