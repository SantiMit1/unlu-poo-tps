package unlu.poo.tp1;

public class Cola {
    private Nodo frente;
    private int cantidadElementos = 0;

    public Cola() {
        this.frente = null;
    }

    public void encolar(Nodo nodo) {
        if (this.frente == null) {
            this.frente = nodo;
        } else {
            Nodo aux = this.frente;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        }
        this.cantidadElementos++;
    }

    public Nodo desencolar() {
        if (this.frente == null) {
            System.out.println("La cola está vacía.");
            return null;
        }
        Nodo aux = this.frente;
        this.frente = this.frente.getSiguiente();
        this.cantidadElementos--;
        return aux;
    }

    public void imprimir() {
        if (this.frente == null) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Elementos de la cola:");
            Nodo actual = this.frente;
            while (actual != null) {
                System.out.println(actual.getClave());
                actual = actual.getSiguiente();
            }
        }
    }

    public Nodo getFrente() {
        return this.frente;
    }

    public int getCantidadElementos() {
        return this.cantidadElementos;
    }
}
