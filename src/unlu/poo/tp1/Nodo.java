package unlu.poo.tp1;

public class Nodo {
    private int clave;
    private String valor;
    private Nodo siguiente;

    public Nodo(int clave, String valor) {
        this.valor = valor;
        this.clave = clave;
        this.siguiente = null;
    }

    public String getValor() {
        return this.valor;
    }

    public int getClave() {
        return this.clave;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
