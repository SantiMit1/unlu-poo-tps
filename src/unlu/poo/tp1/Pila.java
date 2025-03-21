package unlu.poo.tp1;

public class Pila {
    private Nodo tope;
    private int cantidadElementos = 0;

    public Pila() {
        this.tope = null;
    }

    public boolean estaVacia() {
        return this.cantidadElementos == 0;
    }

    public void apilar(Nodo nodo) {
        if (this.tope != null) {
            nodo.setSiguiente(this.tope);
            System.out.println("Elemento apilado: " + nodo.getClave());
        }
        this.tope = nodo;
        this.cantidadElementos++;
    }

    public Nodo desapilar() {
        if (this.estaVacia()) {
            System.out.println("No se puede desapilar el elemento. La pila está vacía.");
            return null;
        }
        Nodo nodo = this.tope;
        this.tope = nodo.getSiguiente();
        System.out.println("Elemento desapilado: " + nodo.getClave());
        this.cantidadElementos--;
        return nodo;
    }

    public void imprimir() {
        if (this.estaVacia()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Elementos de la pila:");
            Nodo actual = this.tope;
            while (actual != null) {
                System.out.println(actual.getClave());
                actual = actual.getSiguiente();
            }
        }
    }

    public Nodo getTope() {
        return this.tope;
    }

    public int getCantidadElementos() {
        return this.cantidadElementos;
    }
}
